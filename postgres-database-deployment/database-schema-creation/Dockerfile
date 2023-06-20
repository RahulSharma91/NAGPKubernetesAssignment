FROM postgres:latest

# Copy the db schema creation SQL file into the image
COPY create.sql /docker-entrypoint-initdb.d/


# Grant permissions to the up SQL file
RUN chown postgres:postgres /docker-entrypoint-initdb.d/create.sql
RUN chmod 755 /docker-entrypoint-initdb.d/create.sql

