// java wrapper for vtkGenericOpenGLRenderWindow object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericOpenGLRenderWindow extends vtkOpenGLRenderWindow
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void Finalize_4();
  public void Finalize()
  {
    Finalize_4();
  }

  private native void Frame_5();
  public void Frame()
  {
    Frame_5();
  }

  private native void MakeCurrent_6();
  public void MakeCurrent()
  {
    MakeCurrent_6();
  }

  private native boolean IsCurrent_7();
  public boolean IsCurrent()
  {
    return IsCurrent_7();
  }

  private native int SupportsOpenGL_8();
  public int SupportsOpenGL()
  {
    return SupportsOpenGL_8();
  }

  private native int IsDirect_9();
  public int IsDirect()
  {
    return IsDirect_9();
  }

  private native void SetFrontLeftBuffer_10(int id0);
  public void SetFrontLeftBuffer(int id0)
  {
    SetFrontLeftBuffer_10(id0);
  }

  private native void SetFrontRightBuffer_11(int id0);
  public void SetFrontRightBuffer(int id0)
  {
    SetFrontRightBuffer_11(id0);
  }

  private native void SetBackLeftBuffer_12(int id0);
  public void SetBackLeftBuffer(int id0)
  {
    SetBackLeftBuffer_12(id0);
  }

  private native void SetBackRightBuffer_13(int id0);
  public void SetBackRightBuffer(int id0)
  {
    SetBackRightBuffer_13(id0);
  }

  private native void SetOwnContext_14(int id0);
  public void SetOwnContext(int id0)
  {
    SetOwnContext_14(id0);
  }

  private native void PushState_15();
  public void PushState()
  {
    PushState_15();
  }

  private native void PopState_16();
  public void PopState()
  {
    PopState_16();
  }

  private native void SetWindowInfo_17(byte[] id0, int len0);
  public void SetWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetWindowInfo_17(bytes0, bytes0.length);
  }

  private native void SetParentInfo_18(byte[] id0, int len0);
  public void SetParentInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetParentInfo_18(bytes0, bytes0.length);
  }

  private native int[] GetScreenSize_19();
  public int[] GetScreenSize()
  {
    return GetScreenSize_19();
  }

  private native void HideCursor_20();
  public void HideCursor()
  {
    HideCursor_20();
  }

  private native void ShowCursor_21();
  public void ShowCursor()
  {
    ShowCursor_21();
  }

  private native void SetFullScreen_22(int id0);
  public void SetFullScreen(int id0)
  {
    SetFullScreen_22(id0);
  }

  private native void WindowRemap_23();
  public void WindowRemap()
  {
    WindowRemap_23();
  }

  private native int GetEventPending_24();
  public int GetEventPending()
  {
    return GetEventPending_24();
  }

  private native void SetNextWindowInfo_25(byte[] id0, int len0);
  public void SetNextWindowInfo(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNextWindowInfo_25(bytes0, bytes0.length);
  }

  private native void CreateAWindow_26();
  public void CreateAWindow()
  {
    CreateAWindow_26();
  }

  private native void DestroyWindow_27();
  public void DestroyWindow()
  {
    DestroyWindow_27();
  }

  private native void SetIsDirect_28(int id0);
  public void SetIsDirect(int id0)
  {
    SetIsDirect_28(id0);
  }

  private native void SetSupportsOpenGL_29(int id0);
  public void SetSupportsOpenGL(int id0)
  {
    SetSupportsOpenGL_29(id0);
  }

  private native void SetIsCurrent_30(boolean id0);
  public void SetIsCurrent(boolean id0)
  {
    SetIsCurrent_30(id0);
  }

  private native void Render_31();
  public void Render()
  {
    Render_31();
  }

  private native float GetMaximumHardwareLineWidth_32();
  public float GetMaximumHardwareLineWidth()
  {
    return GetMaximumHardwareLineWidth_32();
  }

  private native void SetForceMaximumHardwareLineWidth_33(float id0);
  public void SetForceMaximumHardwareLineWidth(float id0)
  {
    SetForceMaximumHardwareLineWidth_33(id0);
  }

  private native float GetForceMaximumHardwareLineWidthMinValue_34();
  public float GetForceMaximumHardwareLineWidthMinValue()
  {
    return GetForceMaximumHardwareLineWidthMinValue_34();
  }

  private native float GetForceMaximumHardwareLineWidthMaxValue_35();
  public float GetForceMaximumHardwareLineWidthMaxValue()
  {
    return GetForceMaximumHardwareLineWidthMaxValue_35();
  }

  private native float GetForceMaximumHardwareLineWidth_36();
  public float GetForceMaximumHardwareLineWidth()
  {
    return GetForceMaximumHardwareLineWidth_36();
  }

  private native void SetReadyForRendering_37(boolean id0);
  public void SetReadyForRendering(boolean id0)
  {
    SetReadyForRendering_37(id0);
  }

  private native boolean GetReadyForRendering_38();
  public boolean GetReadyForRendering()
  {
    return GetReadyForRendering_38();
  }

  private native void SetScreenSize_39(int id0,int id1);
  public void SetScreenSize(int id0,int id1)
  {
    SetScreenSize_39(id0,id1);
  }

  private native void SetScreenSize_40(int id0[]);
  public void SetScreenSize(int id0[])
  {
    SetScreenSize_40(id0);
  }

  private native void SetCurrentCursor_41(int id0);
  public void SetCurrentCursor(int id0)
  {
    SetCurrentCursor_41(id0);
  }

  private native void SetMapped_42(int id0);
  public void SetMapped(int id0)
  {
    SetMapped_42(id0);
  }

  private native void OpenGLInit_43();
  public void OpenGLInit()
  {
    OpenGLInit_43();
  }

  public vtkGenericOpenGLRenderWindow() { super(); }

  public vtkGenericOpenGLRenderWindow(long id) { super(id); }
  public native long   VTKInit();

}
