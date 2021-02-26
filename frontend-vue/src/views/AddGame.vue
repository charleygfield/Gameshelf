<template>
    <div>
        <h1 class="title">Add a Game!</h1>

        <div class="field">
            <label class="label" for="title">Game Title</label>
            <div class="controller">
                <input id="title" class="input" type="text" v-model="game.title" placeholder="Enter Title"/>
            </div>
        </div>

        <div class="field">
            <label class="label" for="player_min">Minimum Players</label>
            <div class="controller">
            <input id="player_min" class="input" type="number" min="1" max="100" v-model="game.player_min">
            </div>
        </div>

        <div class="field">
            <label class="label" for="player_max">Maximum Players</label>
            <div class="controller">
            <input id="player_max" class="input" type="number" min="1" max="100" v-model="game.player_min">
            </div>
        </div>

        <div class="field">
           <label class="label">Owner</label>
           <div class="controller" v-for="person in persons" :key="person.person_id">
                   <input type="radio" :id="person.person_id" :value="person" v-model="person.person_id" class="radio"/>
                   {{person.first_name + person.last_name}}
           </div>
        </div>

        <div class="field">
           <label class="label">{{playtype.playtype}}</label>
           <div class="controller" v-for="playtype in playtypes" :key="playtype.playtype_id">
                   <input type="radio" :id="playtype.playtype_id" :value="playtype_id" v-model="playtype.playtype_id" class="radio"/>
                   {{playtype}}
           </div>
        </div>

        <div class="field is-grouped">
            <div class="controller">
                <button @click="cancel" class="button">Cancel</button>
            </div>
            <div class="controller">
                <button @click="save" class="button is-primary">Save</button>
            </div>
        </div>

    </div>
</template>

<script>
export default {
    name: "AddGame",
    data: () =>({
        game: {
            title: "",
            player_min: {},
            player_max: {},
            person: {},
            playtype: {}
        },
        person: [],
        playtype: [],
}),
methods: {
        async save () {
            console.log('AddGame.save() game=', this.game)
            const response = await this.$http.post('http://localhost:8080/api/game', this.game);
            console.log('AddGame.save() response=', response);
            this.$router.push({path: '/addgame'})
        },
        cancel() {
            this.$router.push({path: '/addgame'})
        },

         async getPerson() {
            const {data} = await this.$http.get('http://localhost:8080/api/person');
            console.log('getPerson() data', data)
            return data;
        },
        async getPlaytype() {
            const {data} = await this.$http.get('http://loclahost:8080/api/playtype');
            console.log('getPlaytype() data', data)
            return data;
        },
     
       
    }, 
    async mounted() {
        this.person = await this.getPerson();
        this.playtype = await this.getPlaytype();
        
    }
    
}
</script>