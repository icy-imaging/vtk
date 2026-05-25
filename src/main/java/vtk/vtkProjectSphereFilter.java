// java wrapper for vtkProjectSphereFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProjectSphereFilter extends vtkPointSetAlgorithm
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

  private native void SetCenter_4(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_4(id0,id1,id2);
  }

  private native void SetCenter_5(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_5(id0);
  }

  private native double[] GetCenter_6();
  public double[] GetCenter()
  {
    return GetCenter_6();
  }

  private native boolean GetKeepPolePoints_7();
  public boolean GetKeepPolePoints()
  {
    return GetKeepPolePoints_7();
  }

  private native void SetKeepPolePoints_8(boolean id0);
  public void SetKeepPolePoints(boolean id0)
  {
    SetKeepPolePoints_8(id0);
  }

  private native void KeepPolePointsOn_9();
  public void KeepPolePointsOn()
  {
    KeepPolePointsOn_9();
  }

  private native void KeepPolePointsOff_10();
  public void KeepPolePointsOff()
  {
    KeepPolePointsOff_10();
  }

  private native boolean GetTranslateZ_11();
  public boolean GetTranslateZ()
  {
    return GetTranslateZ_11();
  }

  private native void SetTranslateZ_12(boolean id0);
  public void SetTranslateZ(boolean id0)
  {
    SetTranslateZ_12(id0);
  }

  private native void TranslateZOn_13();
  public void TranslateZOn()
  {
    TranslateZOn_13();
  }

  private native void TranslateZOff_14();
  public void TranslateZOff()
  {
    TranslateZOff_14();
  }

  public vtkProjectSphereFilter() { super(); }

  public vtkProjectSphereFilter(long id) { super(id); }
  public native long   VTKInit();

}
