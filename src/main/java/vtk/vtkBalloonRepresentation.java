// java wrapper for vtkBalloonRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBalloonRepresentation extends vtkWidgetRepresentation
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

  private native void SetBalloonImage_4(vtkImageData id0);
  public void SetBalloonImage(vtkImageData id0)
  {
    SetBalloonImage_4(id0);
  }

  private native long GetBalloonImage_5();
  public vtkImageData GetBalloonImage()
  {
    long temp = GetBalloonImage_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetBalloonText_6();
  public String GetBalloonText()
  {
    return new String(GetBalloonText_6(), StandardCharsets.UTF_8);
  }

  private native void SetBalloonText_7(byte[] id0, int len0);
  public void SetBalloonText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBalloonText_7(bytes0, bytes0.length);
  }

  private native void SetImageSize_8(int id0,int id1);
  public void SetImageSize(int id0,int id1)
  {
    SetImageSize_8(id0,id1);
  }

  private native void SetImageSize_9(int id0[]);
  public void SetImageSize(int id0[])
  {
    SetImageSize_9(id0);
  }

  private native int[] GetImageSize_10();
  public int[] GetImageSize()
  {
    return GetImageSize_10();
  }

  private native void SetTextProperty_11(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_11(id0);
  }

  private native long GetTextProperty_12();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_12();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFrameProperty_13(vtkProperty2D id0);
  public void SetFrameProperty(vtkProperty2D id0)
  {
    SetFrameProperty_13(id0);
  }

  private native long GetFrameProperty_14();
  public vtkProperty2D GetFrameProperty()
  {
    long temp = GetFrameProperty_14();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetImageProperty_15(vtkProperty2D id0);
  public void SetImageProperty(vtkProperty2D id0)
  {
    SetImageProperty_15(id0);
  }

  private native long GetImageProperty_16();
  public vtkProperty2D GetImageProperty()
  {
    long temp = GetImageProperty_16();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBalloonLayout_17(int id0);
  public void SetBalloonLayout(int id0)
  {
    SetBalloonLayout_17(id0);
  }

  private native int GetBalloonLayout_18();
  public int GetBalloonLayout()
  {
    return GetBalloonLayout_18();
  }

  private native void SetBalloonLayoutToImageLeft_19();
  public void SetBalloonLayoutToImageLeft()
  {
    SetBalloonLayoutToImageLeft_19();
  }

  private native void SetBalloonLayoutToImageRight_20();
  public void SetBalloonLayoutToImageRight()
  {
    SetBalloonLayoutToImageRight_20();
  }

  private native void SetBalloonLayoutToImageBottom_21();
  public void SetBalloonLayoutToImageBottom()
  {
    SetBalloonLayoutToImageBottom_21();
  }

  private native void SetBalloonLayoutToImageTop_22();
  public void SetBalloonLayoutToImageTop()
  {
    SetBalloonLayoutToImageTop_22();
  }

  private native void SetBalloonLayoutToTextLeft_23();
  public void SetBalloonLayoutToTextLeft()
  {
    SetBalloonLayoutToTextLeft_23();
  }

  private native void SetBalloonLayoutToTextRight_24();
  public void SetBalloonLayoutToTextRight()
  {
    SetBalloonLayoutToTextRight_24();
  }

  private native void SetBalloonLayoutToTextTop_25();
  public void SetBalloonLayoutToTextTop()
  {
    SetBalloonLayoutToTextTop_25();
  }

  private native void SetBalloonLayoutToTextBottom_26();
  public void SetBalloonLayoutToTextBottom()
  {
    SetBalloonLayoutToTextBottom_26();
  }

  private native void SetOffset_27(int id0,int id1);
  public void SetOffset(int id0,int id1)
  {
    SetOffset_27(id0,id1);
  }

  private native void SetOffset_28(int id0[]);
  public void SetOffset(int id0[])
  {
    SetOffset_28(id0);
  }

  private native int[] GetOffset_29();
  public int[] GetOffset()
  {
    return GetOffset_29();
  }

  private native void SetPadding_30(int id0);
  public void SetPadding(int id0)
  {
    SetPadding_30(id0);
  }

  private native int GetPaddingMinValue_31();
  public int GetPaddingMinValue()
  {
    return GetPaddingMinValue_31();
  }

  private native int GetPaddingMaxValue_32();
  public int GetPaddingMaxValue()
  {
    return GetPaddingMaxValue_32();
  }

  private native int GetPadding_33();
  public int GetPadding()
  {
    return GetPadding_33();
  }

  private native void StartWidgetInteraction_34(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_34(id0);
  }

  private native void EndWidgetInteraction_35(double id0[]);
  public void EndWidgetInteraction(double id0[])
  {
    EndWidgetInteraction_35(id0);
  }

  private native void BuildRepresentation_36();
  public void BuildRepresentation()
  {
    BuildRepresentation_36();
  }

  private native int ComputeInteractionState_37(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_37(id0,id1,id2);
  }

  private native void ReleaseGraphicsResources_38(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_38(id0);
  }

  private native int RenderOverlay_39(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_39(id0);
  }

  public vtkBalloonRepresentation() { super(); }

  public vtkBalloonRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
