//ofbizDemoTypes = delegator.findList("OfbizDemoType", null, null, null, null, false);
//context.ofbizDemoTypes = ofbizDemoTypes;
//ofbizDemoList = delegator.findList("OfbizDemo", null, null, null, null, false);
//context.ofbizDemoList = ofbizDemoList;

context.ofbizDemoTypes = from("OfbizDemoType").queryList()
context.ofbizDemoList = from("OfbizDemo").queryList()