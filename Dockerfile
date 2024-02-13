version: "3.8"
services:
  db:
    image: postgres
    restart: always
    ports:
      - "54320:5432"
    environment:
      POSTGRES_USER: admin
      POSTGRES_PASSWORD: admin
    volumes:
      - local_pgdata:/var/lib/postgresql/data
    deploy:
      replicas: 2
      
  pgadmin:
    image: dpage/pgadmin4
    restart: always
    ports:
      - "5050:80"
    environment:
      PGADMIN_DEFAULT_EMAIL: teamD.it@gmail.com
      PGADMIN_DEFAULT_PASSWORD: admin
    volumes:
      - pgadmin-data:/var/lib/pgadmin
    deploy:
      replicas: 2

volumes:
  local_pgdata:
  pgadmin-data:

