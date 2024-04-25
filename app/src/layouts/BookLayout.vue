<script setup lang="ts"></script>

<template>
  <n-layout has-sider>
    <n-layout-sider content-style="padding: 24px;">
      <ul>
        <li>
          <RouterLink to="/book">Book</RouterLink>
        </li>
        <li>
          <RouterLink to="/book/create">Create Book</RouterLink>
        </li>
      </ul>
    </n-layout-sider>
    <n-layout>
      <n-layout-content content-style="padding: 24px;">
        <RouterView />
      </n-layout-content>
    </n-layout>
  </n-layout>
</template>
