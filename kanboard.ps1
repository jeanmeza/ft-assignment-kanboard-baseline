param(
    [switch]$RunTests
)

docker stop kanboard
docker rm kanboard
docker run -d --name kanboard -p 8080:80 -t kanboard/kanboard:v1.2.15

if ($RunTests)
{
    do
    {
        Start-Sleep -Seconds 2
    } until ((Invoke-WebRequest -Uri "http://localhost:8080" -UseBasicParsing -ErrorAction SilentlyContinue).StatusCode -eq 200)

    .\mvnw clean test -Dtest=TestSuite
}
