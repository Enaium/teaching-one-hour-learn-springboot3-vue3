<script setup lang="ts">
import { RouterView } from "vue-router";
</script>

<template>
  <NMessageProvider>
    <RouterView />
  </NMessageProvider>
</template>
