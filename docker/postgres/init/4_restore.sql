/* ログイン */
\connect - pgtest;
\c pgtest;

/* SCHEMAを作成 */
CREATE SCHEMA IF NOT EXISTS pgtest AUTHORIZATION pgtest;

/* ドメインを作成します。 */
CREATE DOMAIN pgtest.domain_create_datetime AS TIMESTAMP;
CREATE DOMAIN pgtest.domain_update_count AS SMALLINT;
CREATE DOMAIN pgtest.domain_update_datetime AS TIMESTAMP;

/* TABLEを作成 */
CREATE TABLE IF NOT EXISTS pgtest.sample (
    id SERIAL NOT NULL,
    create_datetime domain_create_datetime,
    update_count domain_update_count,
    update_datetime domain_update_datetime,
    PRIMARY KEY (id)
)