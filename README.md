# coin project

Graphql operations

Create table scripts

```
create TABLE user_table(
    id serial constraint user_pk primary key,
    first_name varchar(50),
    last_name varchar(50),
    birth_date timestamp,
    email varchar(50)
);

CREATE TABLE coin_table (
    name varchar(50),
    user_id bigint,
    PRIMARY KEY (name, user_id)
);
```

