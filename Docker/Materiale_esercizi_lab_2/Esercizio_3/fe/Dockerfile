FROM nginx:alpine

RUN rm -rf /usr/share/nginx/html/*

COPY /dist/prototipo  /usr/share/nginx/html/

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"] && echo "Front end started"
