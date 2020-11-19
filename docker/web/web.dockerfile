ARG BASE_IMAGE=example_base:latest
FROM $BASE_IMAGE
ARG BOOT_JAR_NAME=web-v1.0.0.jar
COPY build /opt/app
COPY web/application.yaml /opt/app/backend/
ENV BOOT_JAR_PATH=/opt/app/backend/${BOOT_JAR_NAME}
RUN set -x \
    && ln -s /opt/app/frontend /opt/app/backend/statics
WORKDIR /opt/app/backend
CMD /usr/bin/java -jar $BOOT_JAR_PATH
