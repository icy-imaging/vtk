// java wrapper for vtkHausdorffDistancePointSetFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHausdorffDistancePointSetFilter extends vtkPointSetAlgorithm
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

  private native double[] GetRelativeDistance_4();
  public double[] GetRelativeDistance()
  {
    return GetRelativeDistance_4();
  }

  private native double GetHausdorffDistance_5();
  public double GetHausdorffDistance()
  {
    return GetHausdorffDistance_5();
  }

  private native void SetTargetDistanceMethod_6(int id0);
  public void SetTargetDistanceMethod(int id0)
  {
    SetTargetDistanceMethod_6(id0);
  }

  private native int GetTargetDistanceMethod_7();
  public int GetTargetDistanceMethod()
  {
    return GetTargetDistanceMethod_7();
  }

  private native void SetTargetDistanceMethodToPointToPoint_8();
  public void SetTargetDistanceMethodToPointToPoint()
  {
    SetTargetDistanceMethodToPointToPoint_8();
  }

  private native void SetTargetDistanceMethodToPointToCell_9();
  public void SetTargetDistanceMethodToPointToCell()
  {
    SetTargetDistanceMethodToPointToCell_9();
  }

  private native byte[] GetTargetDistanceMethodAsString_10();
  public String GetTargetDistanceMethodAsString()
  {
    return new String(GetTargetDistanceMethodAsString_10(), StandardCharsets.UTF_8);
  }

  public vtkHausdorffDistancePointSetFilter() { super(); }

  public vtkHausdorffDistancePointSetFilter(long id) { super(id); }
  public native long   VTKInit();

}
