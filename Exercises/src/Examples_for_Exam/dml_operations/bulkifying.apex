trigger InsertContact on Contact(before insert) {

//wrong
for (Opportunity opp : Trigger.new) {
    Task t = new Task();
    t.Name = 'Give your prospect a free t-shirt';
    t.WhatId = opp.Id;
    insert t; 
}

//good
List<Task> taskList = new List<Task>();
    for (Opportunity opp : Trigger.new) {
        Task t = new Task();
        t.Name = 'Give your prospect a free t-shirt';
        t.WhatId = opp.Id;
        taskList.add(t);
    }
    insert taskList; // Notice this is outside the loop
}