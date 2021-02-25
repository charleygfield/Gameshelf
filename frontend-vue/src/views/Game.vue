<template>
  <div>
     <div class="content">
        <table id="game" class="table">
          <thead>
              <tr>
                  <th>#</th>
                  <th>Title</th>
                  <th>Minimum</th>
                  <th>Maximum</th>
                  <th>Owner</th>
                  <th>Play Type</th>
                </tr>
            </thead>

            <tbody>
                <tr v-for="game in games" :key="game.game_id">
                <td>{{game.game_id}}</td>
                <td>{{game.title}}</td>
                <td>{{game.player_min}}</td>
                <td>{{game.player_max}}</td>
                <td>{{person.first_name}}{{person.last_name}}</td>
                <td>{{playtype.playtype}}</td>
              </tr>
            </tbody>
        </table>
      </div>
  </div>
</template>
