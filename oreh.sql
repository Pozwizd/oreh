create database if not exists oreh;
use oreh;

CREATE TABLE if not exists contact
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    phone_number1    VARCHAR(20),
    phone_number2    VARCHAR(20),
    email            VARCHAR(100),
    address_title    VARCHAR(100),
    address_line1    VARCHAR(100),
    address_line2    VARCHAR(100),
    production_title VARCHAR(100),
    production_line1 VARCHAR(100),
    production_line2 VARCHAR(100),
    map_image        varchar(100),
    pointer_map      varchar(100)
);

INSERT INTO contact (phone_number1,
                     phone_number2,
                     email,
                     address_title,
                     address_line1,
                     address_line2,
                     production_title,
                     production_line1,
                     production_line2,
                     map_image,
                     pointer_map)
VALUES ('+38 (095) 711 11 11',
        '+38 (095) 722 22 22',
        'nuts@nbsc.com.ua',
        'Офис и отдел продаж',
        'Украина, г. Одесса',
        'ул. Космонавтов, 32',
        'Производство',
        'Украина, Одесская обл',
        'с. Яськи, ул. Центральная, 232',
        'img/main/map.png',
        'img/icons/pointer.svg');
# ---------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE if not exists title_text
(
    id    INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    text  VARCHAR(255),
    url   VARCHAR(255)
);

INSERT title_text (title, text)
VALUES ('Орех Причерноморья',
        'Единственный в Украине
        сад совместного выращивание фундука и грецкого ореха'),
       ('Продукция',
        'Экологически чистые, качественные ядра грецкого ореха и фундука, а также плоды шиповника в удобной, надежной, вакуумной упаковке разного объема'),
       ('Наша главная цель - получить максимальную прибыль с одного гектара',
        'Cмотреть видео о производстве'),
       ('О пользе продукта',
        'Каждый вид ореха содержит свой неповторимый уникальный баланс витаминов, и микроэлементов'),
       ('Новости',
        'Свежие новости и полезная информация');

# ---------------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE if not exists article
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    title       VARCHAR(100),
    text        text,
    text_line_2 text,
    text_line_3 text
);

INSERT into article (title, text, text_line_2, text_line_3)
VALUES ('О производителе',
        '<span class="manufacturer__text manufacturer__text--green">Сельскохозяйственный обслуживающий кооператив "Орех Причерноморья"</span>
        выращивает смешанные сады ореха грецкого с фундуком, а также ореха грецкого с шиповником, на площади более 150 гектаров.',
        'Помимо этого кооператив занимается выращиванием посадочного материала, саженцов привитого и непривитого грецкого ореха, фундука и шиповника.',
        ''),
       ('Грецкий орех',
        'Дерево жизни - так часто величают грецкий орех, поскольку с давних пор он кормил, восстанавливал силы и лечил человека.',
        'Даже небольшая горсть грецких орехов - это кладезь витаминов и хорошая профилактика многих заболеваний',
        ''),
       ('Фундук',
        'Дерево жизни - так часто величают фундук, поскольку с давних пор он кормил, восстанавливал силы и лечил человека.',
        'Даже небольшая горсть фундука - это кладезь витаминов и хорошая профилактика многих заболеваний',
        ''),
       ('Шиповник',
        'Дерево жизни - так часто величают фундук, поскольку с давних пор он кормил, восстанавливал силы и лечил человека.',
        'Даже небольшая горсть фундука - это кладезь витаминов и хорошая профилактика многих заболеваний',
        '');
# ---------------------------------------------------------------------------------------------------------------------------------------


CREATE TABLE if not exists news
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    url         VARCHAR(255),
    date        DATE,
    title       VARCHAR(100),
    text        VARCHAR(255),
    text_line_2 VARCHAR(255)
);

insert into news (url, date, title, text, text_line_2)
VALUES ('img/main/pavel-news-block.png',
        '2019-04-12',
        'Центр поддержки экспорта, в студии Павел Тулба',
        'Как уже упоминал Павел Тулба, шиповник цветёт. Эта
        культура очень недооценена среди наших садоводов, не смотря на большой спрос в Европе и отличную...',
        ''),
       ('img/main/meeting-news-block.png',
        '2019-04-12',
        'Центр поддержки экспорта, в студии Павел Тулба',
        'Как уже упоминал Павел Тулба, шиповник цветёт. Эта
        культура очень недооценена среди наших садоводов, не смотря на большой спрос в Европе и отличную...',
        ''),
       ('img/main/nut-crate-news-block.png',
        '12.04.2019',
        'Центр поддержки экспорта, в студии Павел Тулба',
        'Как уже упоминал Павел Тулба, шиповник цветёт. Эта
        культура очень недооценена среди наших садоводов, не смотря на большой спрос в Европе и отличную...',
        ''),
       ('img/main/pavel-news-block.png',
        '12.04.2019',
        'Центр поддержки экспорта, в студии Павел Тулба',
        'Как уже упоминал Павел Тулба, шиповник цветёт. Эта
        культура очень недооценена среди наших садоводов, не смотря на большой спрос в Европе и отличную...',
        '');

# ---------------------------------------------------------------------------------------------------------------------------------------

-- Создание таблицы product
CREATE TABLE product
(
    id             INT PRIMARY KEY,
    image_url      VARCHAR(255),
    image_url_2    VARCHAR(255),
    image_url_3    VARCHAR(255),
    special_offer  VARCHAR(255),
    title          VARCHAR(255),
    article_number VARCHAR(255),
    description    VARCHAR(255),
    weight         VARCHAR(255),
    package_type   VARCHAR(255),
    price          DECIMAL(10, 2),
    original_price DECIMAL(10, 2)
);


INSERT INTO product (id,
                     image_url,
                     image_url_2,
                     image_url_3,
                     special_offer,
                     title,
                     article_number,
                     description,
                     weight,
                     package_type,
                     price,
                     original_price) VALUE
    (1,
     'img/main/KOND-40g.png',
     'img/main/KOND-40g.png',
     'img/main/KOND-40g.png',
     'АКЦИЯ',
     'Грецкий орех',
     'Арт: 0091',
     'Орех сладкий, классический, очищенный',
     '40г.',
     'вакуумная',
     '19',
     '21'),
    (2,
     'img/main/SOLODKY-40g.png',
     'img/main/SOLODKY-40g.png',
     'img/main/SOLODKY-40g.png',
     'НОВИНКА',
     'Грецкий орех',
     'Арт: 0091',
     'Орех сладкий, классический, очищенный',
     '40г.',
     'вакуумная',
     21.00,
     NULL),
    (3,
     'img/main/SOLONY-40g.png',
     'img/main/SOLONY-40g.png',
     'img/main/SOLONY-40g.png',
     NULL,
     'Грецкий орех',
     'Арт: 0091',
     'Орех сладкий, классический, очищенный',
     '40г.',
     'вакуумная',
     21.00,
     NULL),
    (4,
     'img/main/gorih1.png',
     'img/main/gorih1.png',
     'img/main/gorih1.png',
     NULL,
     'Грецкий орех',
     'Арт: 0091',
     'Орех сладкий, классический, очищенный',
     '40г.',
     'вакуумная',
     21.00,
     NULL),
    (5,
     'img/main/gorih2.png',
     'img/main/gorih2.png',
     'img/main/gorih2.png',
     NULL,
     'Грецкий орех',
     'Арт: 0091',
     'Орех сладкий, классический, очищенный',
     '40г.',
     'вакуумная',
     21.00,
     NULL),
    (6,
     'img/main/gorih3.png',
     'img/main/gorih3.png',
     'img/main/gorih3.png',
     NULL,
     'Грецкий орех',
     'Арт: 0091',
     'Орех сладкий, классический, очищенный',
     '40г.',
     'вакуумная',
     21.00,
     NULL);
