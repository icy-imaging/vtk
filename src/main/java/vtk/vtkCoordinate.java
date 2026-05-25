// java wrapper for vtkCoordinate object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCoordinate extends vtkObject
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

  private native void SetCoordinateSystem_4(int id0);
  public void SetCoordinateSystem(int id0)
  {
    SetCoordinateSystem_4(id0);
  }

  private native int GetCoordinateSystem_5();
  public int GetCoordinateSystem()
  {
    return GetCoordinateSystem_5();
  }

  private native void SetCoordinateSystemToDisplay_6();
  public void SetCoordinateSystemToDisplay()
  {
    SetCoordinateSystemToDisplay_6();
  }

  private native void SetCoordinateSystemToNormalizedDisplay_7();
  public void SetCoordinateSystemToNormalizedDisplay()
  {
    SetCoordinateSystemToNormalizedDisplay_7();
  }

  private native void SetCoordinateSystemToViewport_8();
  public void SetCoordinateSystemToViewport()
  {
    SetCoordinateSystemToViewport_8();
  }

  private native void SetCoordinateSystemToNormalizedViewport_9();
  public void SetCoordinateSystemToNormalizedViewport()
  {
    SetCoordinateSystemToNormalizedViewport_9();
  }

  private native void SetCoordinateSystemToView_10();
  public void SetCoordinateSystemToView()
  {
    SetCoordinateSystemToView_10();
  }

  private native void SetCoordinateSystemToPose_11();
  public void SetCoordinateSystemToPose()
  {
    SetCoordinateSystemToPose_11();
  }

  private native void SetCoordinateSystemToWorld_12();
  public void SetCoordinateSystemToWorld()
  {
    SetCoordinateSystemToWorld_12();
  }

  private native byte[] GetCoordinateSystemAsString_13();
  public String GetCoordinateSystemAsString()
  {
    return new String(GetCoordinateSystemAsString_13(), StandardCharsets.UTF_8);
  }

  private native void SetValue_14(double id0,double id1,double id2);
  public void SetValue(double id0,double id1,double id2)
  {
    SetValue_14(id0,id1,id2);
  }

  private native void SetValue_15(double id0[]);
  public void SetValue(double id0[])
  {
    SetValue_15(id0);
  }

  private native double[] GetValue_16();
  public double[] GetValue()
  {
    return GetValue_16();
  }

  private native void SetValue_17(double id0,double id1);
  public void SetValue(double id0,double id1)
  {
    SetValue_17(id0,id1);
  }

  private native void SetReferenceCoordinate_18(vtkCoordinate id0);
  public void SetReferenceCoordinate(vtkCoordinate id0)
  {
    SetReferenceCoordinate_18(id0);
  }

  private native long GetReferenceCoordinate_19();
  public vtkCoordinate GetReferenceCoordinate()
  {
    long temp = GetReferenceCoordinate_19();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetViewport_20(vtkViewport id0);
  public void SetViewport(vtkViewport id0)
  {
    SetViewport_20(id0);
  }

  private native long GetViewport_21();
  public vtkViewport GetViewport()
  {
    long temp = GetViewport_21();

    if (temp == 0) return null;
    return (vtkViewport)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetComputedWorldValue_22(vtkViewport id0);
  public double[] GetComputedWorldValue(vtkViewport id0)
  {
    return GetComputedWorldValue_22(id0);
  }

  private native int[] GetComputedViewportValue_23(vtkViewport id0);
  public int[] GetComputedViewportValue(vtkViewport id0)
  {
    return GetComputedViewportValue_23(id0);
  }

  private native int[] GetComputedDisplayValue_24(vtkViewport id0);
  public int[] GetComputedDisplayValue(vtkViewport id0)
  {
    return GetComputedDisplayValue_24(id0);
  }

  private native int[] GetComputedLocalDisplayValue_25(vtkViewport id0);
  public int[] GetComputedLocalDisplayValue(vtkViewport id0)
  {
    return GetComputedLocalDisplayValue_25(id0);
  }

  private native double[] GetComputedDoubleViewportValue_26(vtkViewport id0);
  public double[] GetComputedDoubleViewportValue(vtkViewport id0)
  {
    return GetComputedDoubleViewportValue_26(id0);
  }

  private native double[] GetComputedDoubleDisplayValue_27(vtkViewport id0);
  public double[] GetComputedDoubleDisplayValue(vtkViewport id0)
  {
    return GetComputedDoubleDisplayValue_27(id0);
  }

  private native double[] GetComputedValue_28(vtkViewport id0);
  public double[] GetComputedValue(vtkViewport id0)
  {
    return GetComputedValue_28(id0);
  }

  private native double[] GetComputedUserDefinedValue_29(vtkViewport id0);
  public double[] GetComputedUserDefinedValue(vtkViewport id0)
  {
    return GetComputedUserDefinedValue_29(id0);
  }

  public vtkCoordinate() { super(); }

  public vtkCoordinate(long id) { super(id); }
  public native long   VTKInit();

}
