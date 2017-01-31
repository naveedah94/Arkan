package com.arkan.arkan.Adapters;

/**
 * Created by mbp on 02/01/2017.
 */

public class CustomViewPagerAdapter {//extends FragmentPagerAdapter implements SmartTabLayout.TabProvider {

//    private Context context;
//    public CustomViewPagerAdapter(FragmentManager fm, Context context) {
//        super(fm);
//        this.context = context;
//    }
//
//    public enum MainActivityPages {
//        TAB_1(0, "Tab #1", R.drawable.meetings_tab_icon, TabFragment1.newInstance()),
//        TAB_2(1, "Tab #2", R.drawable.announcements_tab_icon, TabFragment2.newInstance()),
//        TAB_3(2, "Tab #3", R.drawable.discussions_tab_icon, TabFragment3.newInstance()),
//        TAB_4(3, "Tab #4", R.drawable.my_tasks_tab_icon, TabFragment3.newInstance()),
//        TAB_5(4, "Tab #5", R.drawable.digital_assets_tab_icon, TabFragment3.newInstance());
//
//        public int index;
//        public String title;
//        public int resourceId;
//        public Fragment fragment;
//
//        MainActivityPages(int index, String title, int resourceId, Fragment fragment) {
//            this.index = index;
//            this.title = title;
//            this.resourceId = resourceId;
//            this.fragment = fragment;
//        }
//    }
//
//    @Override
//    public Fragment getItem(int position) {
//        return MainActivityPages.values()[position].fragment;
//    }
//
//    @Override
//    public int getCount() {
//        return MainActivityPages.values().length;;
//    }
//
//    @Override
//    public CharSequence getPageTitle(int position) {
//        return MainActivityPages.values()[position].title;
//    }
//
//    @Override
//    public View createTabView(ViewGroup container, int position, PagerAdapter adapter) {
//        View v = LayoutInflater.from(this.context).inflate(R.layout.tab_layout, null);
//        v.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//        if(v != null) {
//            ImageView icon = (ImageView) v.findViewById(R.id.activity_main_tab_icon);
//            icon.setImageResource(MainActivityPages.values()[position].resourceId);
//        }
//
//        return v;
//    }
}
