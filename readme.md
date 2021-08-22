<h4>Реализованная функциональность</h4>
<ul>
    <li>Просмотр и добавление резидентов;</li>
    <li>Просмотр и добавление мероприятий, проводимых резидентами;</li>
    <li>Просмотр и добавление продаж на мероприятиях;</li>
    <li>Просмотр и добавление помещений;</li>
    <li>В базе данных внешние ключи для связывания сущностей как "один ко многим" и "многие ко многим".</li>
</ul> 
<h4>Особенность проекта в следующем:</h4>
<ul>
 <li>Совмещение виртуального тура с подписями о помещениях;</li>
 <li>Автоматическое определение уровня шума в помещениях в зависимости от соседних резидентов по их категориям и тегам.</li>
</ul>
<h4>Основной стек технологий:</h4>
<ul>
    <li>Java SpringBoot, PostgreSQL.</li>
	<li>Power BI.</li>
	<li>js, php.</li>
</ul>

СРЕДА ЗАПУСКА
------------
1) развертывание сервиса производится в IntelliJIdea Community 2020.2.1;
2) версия SDK: 1.8;
3) требуется установленная Postgres (версия 13.4).

УСТАНОВКА
------------
### Установка проекта

Выполните 
~~~
git clone https://github.com/pusher71/project_test.git
~~~
### База данных

Необходимо запустить базу данных postgres по адресу jdbc:postgresql://localhost:5432/project_test_db, и в ней выполнить инициализирующий скрипт init_database.sql

### Установка зависимостей проекта

Установка зависимостей осуществляется внутри среды разработки IntelliJIdea (они указаны в файле pom.xml).

РАЗРАБОТЧИКИ

<h4>Бондаренко Богдан backend https://vk.com/id154239070</h4>
