// java wrapper for vtkGraphLayout object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGraphLayout extends vtkGraphAlgorithm
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

  private native void SetLayoutStrategy_4(vtkGraphLayoutStrategy id0);
  public void SetLayoutStrategy(vtkGraphLayoutStrategy id0)
  {
    SetLayoutStrategy_4(id0);
  }

  private native long GetLayoutStrategy_5();
  public vtkGraphLayoutStrategy GetLayoutStrategy()
  {
    long temp = GetLayoutStrategy_5();

    if (temp == 0) return null;
    return (vtkGraphLayoutStrategy)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IsLayoutComplete_6();
  public int IsLayoutComplete()
  {
    return IsLayoutComplete_6();
  }

  private native long GetMTime_7();
  public long GetMTime()
  {
    return GetMTime_7();
  }

  private native double GetZRange_8();
  public double GetZRange()
  {
    return GetZRange_8();
  }

  private native void SetZRange_9(double id0);
  public void SetZRange(double id0)
  {
    SetZRange_9(id0);
  }

  private native long GetTransform_10();
  public vtkAbstractTransform GetTransform()
  {
    long temp = GetTransform_10();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransform_11(vtkAbstractTransform id0);
  public void SetTransform(vtkAbstractTransform id0)
  {
    SetTransform_11(id0);
  }

  private native void SetUseTransform_12(boolean id0);
  public void SetUseTransform(boolean id0)
  {
    SetUseTransform_12(id0);
  }

  private native boolean GetUseTransform_13();
  public boolean GetUseTransform()
  {
    return GetUseTransform_13();
  }

  private native void UseTransformOn_14();
  public void UseTransformOn()
  {
    UseTransformOn_14();
  }

  private native void UseTransformOff_15();
  public void UseTransformOff()
  {
    UseTransformOff_15();
  }

  public vtkGraphLayout() { super(); }

  public vtkGraphLayout(long id) { super(id); }
  public native long   VTKInit();

}
