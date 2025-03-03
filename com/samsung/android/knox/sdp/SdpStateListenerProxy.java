package com.samsung.android.knox.sdp;

import com.sec.enterprise.knox.sdp.SdpStateListener;

class SdpStateListenerProxy extends SdpStateListener {
    private SdpStateListener mNewListener;

    public SdpStateListenerProxy(SdpStateListener sdpStateListener) {
        this.mNewListener = sdpStateListener;
    }

    public void onEngineRemoved() {
        SdpStateListener sdpStateListener = this.mNewListener;
        if (sdpStateListener != null) {
            sdpStateListener.onEngineRemoved();
        }
    }

    public void onStateChange(int i) {
        SdpStateListener sdpStateListener = this.mNewListener;
        if (sdpStateListener != null) {
            sdpStateListener.onStateChange(i);
        }
    }
}
