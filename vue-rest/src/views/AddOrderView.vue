<script>
import addorder from "@/components/AddOrder.vue";
export default {
  name: "AddOrderView",
  components: {
    addorder,
  },
};
</script>

<template>
  <div class="home">
    <addorder msg="新增訂單" />
  </div>
</template>

<style scoped></style>
