FROM ubuntu:latest
LABEL authors="rumic"

ENTRYPOINT ["top", "-b"]