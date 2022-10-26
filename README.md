
# Prometheus & Grafana | Cristian González Hens

Prometheus y Grafana son herramientas que sirven para monitorear nuestros microservicios.

Para permitir su uso tenemos que agregar las siguientes dependencias:




## Pasos previos Prometheus

Dependecias:

```bash
  		<!--Micrometer -->

		<dependency>
			<groupId>io.micrometer</groupId>
			<artifactId>micrometer-registry-prometheus</artifactId>
		</dependency>
```

Seguidamente tenemos que abrir una terminal y ejecutar el siguiente comando:

```bash
  	docker run \
    -p 9090:9090 \
    -v *SUSTITUIR POR RUTA DONDE SE ENCUENTRE EL ARCHIVO DE CONFIGURACIÓN YML/prometheus.yml*:/etc/prometheus/prometheus.yml \
    prom/prometheus

```

* Abrimos docker y deberíamos de ver la imagen recien creada (solo debería de aparecer una, la de prometheus):

<a href="https://ibb.co/619W0vh"><img src="https://i.ibb.co/619W0vh/Captura-de-pantalla-2022-10-26-a-las-18-01-42.png" alt="Captura-de-pantalla-2022-10-26-a-las-18-01-42" border="0"></a>

* Le damos a iniciar y accedemos a la url --> http://localhost:9090/targets 

* Deberíamos de ver ambos endpoints en UP.

<a href="https://ibb.co/BjK8qqM"><img src="https://i.ibb.co/BjK8qqM/Captura-de-pantalla-2022-10-26-a-las-17-42-48.png" alt="Captura-de-pantalla-2022-10-26-a-las-17-42-48" border="0"></a>

* Desde la sección Graph podrémos ver las métricas de nuestro sitio web.

<a href="https://ibb.co/yp24mNC"><img src="https://i.ibb.co/yp24mNC/Captura-de-pantalla-2022-10-26-a-las-17-42-41.png" alt="Captura-de-pantalla-2022-10-26-a-las-17-42-41" border="0"></a>

## Pasos previos Grafana

No será muy diferente del paso anterior, directamente introducimos este comando:

```bash
  	docker run -d --name=grafana -p 3000:3000 grafana/grafana
```
* Accedemos a docker y confirmamos que la imagen esta creada y y levantada (debería de aparecer tanto la de prometheus como la de grafana).

<a href="https://ibb.co/619W0vh"><img src="https://i.ibb.co/619W0vh/Captura-de-pantalla-2022-10-26-a-las-18-01-42.png" alt="Captura-de-pantalla-2022-10-26-a-las-18-01-42" border="0"></a>

* Accedemos a la url --> http://localhost:3000/ 

* Usuario y contraseña : admin

* Configurar prometheus y en dirección (si es local) se introduce "host.docker.internal:9090" para que tome la imagen docker interna.

* Guardamos y hacemos un test de conexión y debería de funcionar.

* Creamos un nuevo Dashboard tomando como fuente de datos la anterior creada, guardamos la consulta que queramos monitorear y ya tendrémos un nuevo dashboard creado para monitorear rápidamente la información que nos interese.

<a href="https://ibb.co/SvNC7Ng"><img src="https://i.ibb.co/SvNC7Ng/Captura-de-pantalla-2022-10-26-a-las-17-52-07.png" alt="Captura-de-pantalla-2022-10-26-a-las-17-52-07" border="0"></a>

## Authors

- [@criserto](https://github.com/criserto)
