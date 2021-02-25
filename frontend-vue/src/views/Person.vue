<template>
  <div class="main">
      <div clas="header">
    <h1 class="title"> Actors</h1>
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
                <tr v-for="person in person" :key="person.id">
                <td>{{person.id}}</td>
                <td>{{person.first_name}} {{person.last_name}}</td>
              </tr>
            </tbody>
        </table>
      </div>
  </div>
</template>