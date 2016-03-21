FROM centos:latest
RUN useradd boot-batch-docker
WORKDIR /home/boot-batch-docker
RUN yum install -y wget
RUN wget http://puias.math.ias.edu/data/puias/7/x86_64/os/Addons/Packages/fortune-mod-1.99.1-17.sdl7.x86_64.rpm
RUN yum install -y fortune-mod-1.99.1-17.sdl7.x86_64.rpm
RUN wget http://dl.fedoraproject.org/pub/epel/6/i386/cowsay-3.03-8.el6.noarch.rpm
RUN yum install -y cowsay-3.03-8.el6.noarch.rpm
RUN rm -rfv *.rpm
RUN mkdir config
RUN touch config/application.properties
RUN yum install -y java-1.7.0-openjdk
ENV version 1
COPY batch-boot-docker-0.0.1-SNAPSHOT.jar /home/boot-batch-docker
