docker stop kanboard
docker rm kanboard
docker run -d --name kanboard -p 8080:80 -t kanboard/kanboard:v1.2.15