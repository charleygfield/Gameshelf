<template>
  <div class="main">
      <div clas="header">
    <h1 class="title"> People </h1>
  </div>

  <router-link to="/addperson" tag="button" class="button is-primary">Add People</router-link>

    <div class="content">
        <table id="people" class="table">
          <thead>
              <tr>
                  <th>#</th>
                  <th>Name</th>
                </tr>
            </thead>

            <tbody>
                <tr v-for="person in persons" :key="person.person_id">
                <td>{{person.person_id}}</td>
                <td>{{person.first_name}} {{person.last_name}}</td>
              </tr>
            </tbody>
        </table>
      </div>

      <div>

      </div>
  </div>
</template>

<script>
export default {
  name: 'Person',
  data: () => ({
    persons: []
  }),
  async mounted(){
    console.log('person mounted being')
    const{ data } = await this.$http.get('http://localhost:8080/person');
    console.log('person mounted data', data)
    this.person = data;
  }

}
</script>