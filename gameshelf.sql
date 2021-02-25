create DATABASE if not exists gameshelf;
use gameshelf;

drop DATABASE if exists gameshelf;


    create table person (
		person_id int auto_increment primary key,
        first_name varchar(50),
        last_name varchar(50)
        );
        
	insert into person (first_name, last_name) values ('Charley', 'Greenfield');
    insert into person (first_name, last_name) values ('Bunny', 'Morrow');
    insert into person (first_name, last_name) values ('Jan', 'Anderson');
    insert into person (first_name, last_name) values ('Madee', 'Greenfield');
        
	create table playtype (
		type_id int auto_increment primary key,
        playtype varchar(50)
        );
	
    insert into playtype (playtype) values ('Cooperative');
    insert into playtype (playtype) values ('Competative');
    insert into playtype (playtype) values ('Hidden Traitor');
    insert into playtype (playtype) values ('Family');
    
    create table game (
		game_id int auto_increment primary key,
		title varchar(100),
		player_min int,
		player_max int,
		person_id int,
		type_id int,
		FOREIGN KEY (person_id) REFERENCES person (person_id),
		FOREIGN KEY (type_id) REFERENCES playtype (type_id)
		);
    
insert into game(title, player_min, player_max, person_id, type_id) values ('Betrayal at House on the Hill', '3', '4', 1, 3);
insert into game(title, player_min, player_max, person_id, type_id) values ('Mysterium', '2', '7', 1, 1);
insert into game(title, player_min, player_max, person_id, type_id) values ('Forbidden Island', '2', '4', 3, 1);
insert into game(title, player_min, player_max, person_id, type_id) values ('Apples to Apples', '4', '8', 3, 4);
insert into game(title, player_min, player_max, person_id, type_id) values ('Giant Jenga', '2', '10', 4, 4);
insert into game(title, player_min, player_max, person_id, type_id) values ('Trivial Pursuit', '2', '6', 4, 4);
insert into game(title, player_min, player_max, person_id, type_id) values ('Letters from Whitechapel', '2', '6', 2, 3);
insert into game(title, player_min, player_max, person_id, type_id) values ('Fluxx', '2', '6', 2, 2);

	create table gamenight (
		gamenight_id int auto_increment primary key,
		game_id int,
		FOREIGN KEY (game_id) references game (game_id)
		);
		
    
    select * from game;
    select * from person;