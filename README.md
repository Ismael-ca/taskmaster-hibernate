# 🧠 TaskMaster - Gestor de Tareas con Hibernate + JPA

Proyecto simple de Java para gestionar tareas usando **Hibernate + JPA**, ideal para aprender y demostrar el uso de persistencia de datos con buenas prácticas en Java.

## 🚀 Tecnologías usadas

- ✅ Java 17
- ✅ Hibernate ORM + Jakarta Persistence (JPA)
- ✅ H2 Database (en memoria)
- ✅ Maven

## 📌 Características

- CRUD completo de tareas (`Task`)
- Persistencia con JPA y Hibernate
- Arquitectura con DAO y `EntityManager`
- Base de datos en memoria (o persistente si se cambia el `persistence.xml`)

## 🧱 Estructura del proyecto

src/
├── main/
│ ├── java/com/example/taskmaster/
│ │ ├── entity/
│ │ │ ├── Task.java
│ │ │ └── Status.java
│ │ ├── dao/
│ │ │ └── TaskDAO.java
│ │ ├── util/
│ │ │ └── JPAUtil.java
│ │ └── Main.java
│ └── resources/
│ └── META-INF/persistence.xml


## 🔧 Cómo ejecutar

1. Clona este repositorio:
   ```bash
   git clone https://github.com/Ismael-ca/taskmaster-hibernate.git

📝 Ejemplo de salida en consola

📋 Lista de tareas:
Task{id=1, title='Actualizar CV', status=PENDING, dueDate=...}
Task{id=2, title='Preparar entrevista', status=IN_PROGRESS, dueDate=...}

🔍 Tarea con ID 1: Task{id=1, ...}

✅ Tarea actualizada: Task{id=1, status=COMPLETED, ...}

🗑️ Lista tras borrar ID 2:
Task{id=1, ...}

👨‍💻 Autor

Ismael C.A.
Desarrollador Java Jr. | Titulado en DAM
📫 ismael.ca@hotmail.com
🔗 GitHub: Ismael-ca