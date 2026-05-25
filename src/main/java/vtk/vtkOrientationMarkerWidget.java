// java wrapper for vtkOrientationMarkerWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrientationMarkerWidget extends vtkInteractorObserver
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native long GetRenderer_5();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_5();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOrientationMarker_6(vtkProp id0);
  public void SetOrientationMarker(vtkProp id0)
  {
    SetOrientationMarker_6(id0);
  }

  private native long GetOrientationMarker_7();
  public vtkProp GetOrientationMarker()
  {
    long temp = GetOrientationMarker_7();

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnabled_8(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_8(id0);
  }

  private native void SetInteractive_9(int id0);
  public void SetInteractive(int id0)
  {
    SetInteractive_9(id0);
  }

  private native int GetInteractive_10();
  public int GetInteractive()
  {
    return GetInteractive_10();
  }

  private native void InteractiveOn_11();
  public void InteractiveOn()
  {
    InteractiveOn_11();
  }

  private native void InteractiveOff_12();
  public void InteractiveOff()
  {
    InteractiveOff_12();
  }

  private native void SetOutlineColor_13(double id0,double id1,double id2);
  public void SetOutlineColor(double id0,double id1,double id2)
  {
    SetOutlineColor_13(id0,id1,id2);
  }

  private native double[] GetOutlineColor_14();
  public double[] GetOutlineColor()
  {
    return GetOutlineColor_14();
  }

  private native void SetViewport_15(double id0,double id1,double id2,double id3);
  public void SetViewport(double id0,double id1,double id2,double id3)
  {
    SetViewport_15(id0,id1,id2,id3);
  }

  private native void SetViewport_16(double id0[]);
  public void SetViewport(double id0[])
  {
    SetViewport_16(id0);
  }

  private native double[] GetViewport_17();
  public double[] GetViewport()
  {
    return GetViewport_17();
  }

  private native void SetTolerance_18(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_18(id0);
  }

  private native int GetToleranceMinValue_19();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_19();
  }

  private native int GetToleranceMaxValue_20();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_20();
  }

  private native int GetTolerance_21();
  public int GetTolerance()
  {
    return GetTolerance_21();
  }

  private native void SetZoom_22(double id0);
  public void SetZoom(double id0)
  {
    SetZoom_22(id0);
  }

  private native double GetZoomMinValue_23();
  public double GetZoomMinValue()
  {
    return GetZoomMinValue_23();
  }

  private native double GetZoomMaxValue_24();
  public double GetZoomMaxValue()
  {
    return GetZoomMaxValue_24();
  }

  private native double GetZoom_25();
  public double GetZoom()
  {
    return GetZoom_25();
  }

  private native void Modified_26();
  public void Modified()
  {
    Modified_26();
  }

  private native void EndInteraction_27();
  public void EndInteraction()
  {
    EndInteraction_27();
  }

  private native void SetShouldConstrainSize_28(int id0);
  public void SetShouldConstrainSize(int id0)
  {
    SetShouldConstrainSize_28(id0);
  }

  private native int GetShouldConstrainSize_29();
  public int GetShouldConstrainSize()
  {
    return GetShouldConstrainSize_29();
  }

  private native boolean SetSizeConstraintDimensionSizes_30(int id0,int id1);
  public boolean SetSizeConstraintDimensionSizes(int id0,int id1)
  {
    return SetSizeConstraintDimensionSizes_30(id0,id1);
  }

  private native int GetMinDimensionSize_31();
  public int GetMinDimensionSize()
  {
    return GetMinDimensionSize_31();
  }

  private native int GetMaxDimensionSize_32();
  public int GetMaxDimensionSize()
  {
    return GetMaxDimensionSize_32();
  }

  public vtkOrientationMarkerWidget() { super(); }

  public vtkOrientationMarkerWidget(long id) { super(id); }
  public native long   VTKInit();

}
