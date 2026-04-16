# Optional Lab 7 Notes - Davinder Kehal

Completed Optional Lab 7 for CPAN-228.

## What I added
- Dockerized the main application
- Added a separate battle-service container
- Connected the main app, MySQL database, and battle service using Docker Compose

## What I tested
- Confirmed 3 containers were running:
  - mysql-db
  - main-app
  - battle-service-app
- Confirmed the application opened at http://localhost:8080
- Confirmed the battle result page worked after clicking FIGHT
- Confirmed containers were stopped successfully after cleanup

## Notes
This project was tested successfully in Docker and matches the Optional Lab 7 screenshot requirements.