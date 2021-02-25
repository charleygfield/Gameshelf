<template>
    <div>
        <h1 class="title">Add Someone</h1>
      
        
        <div class="field">
            <label class="label">First Name</label>
            <div class="control">
                <input class="input" type="text" v-model="person.first_name" placeholder="First Name"/>
            </div>
        </div>

        <div class="field">
            <label class="label">Last Name</label>
            <div class="control">
                <input class="input" type="text" v-model="person.last_name" placeholder="First Name"/>
            </div>
        </div>

        <div class="field is-grouped">
            <p class="control">
                <button v-on:click="cancel" class="button">Cancel</button>
            </p>

            <p class="control">
                <button v-on:click="save" class="button is-primary">Save</button>
            </p>
        </div>
        
    </div>
</template>

<script>
export default {
    name: 'AddPeople',
    data: () => ({
        person: {
            first_name: "",
            last_name: "",
        }
    }),
    methods:{
        cancel(){
            this.$router.push({path: '/person'});
        },
        async save(){
            const response = await this.$http.post('http://localhost:8080/api/person/',
            this.person)
            console.log(response);
            if( response.status === 200){
                this.$router.push({path: '/person'});
            }
        }
    }
}
</script>