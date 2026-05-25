// java wrapper for vtkReebGraphSimplificationMetric object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkReebGraphSimplificationMetric extends vtkObject
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

  private native void SetLowerBound_4(double id0);
  public void SetLowerBound(double id0)
  {
    SetLowerBound_4(id0);
  }

  private native double GetLowerBound_5();
  public double GetLowerBound()
  {
    return GetLowerBound_5();
  }

  private native void SetUpperBound_6(double id0);
  public void SetUpperBound(double id0)
  {
    SetUpperBound_6(id0);
  }

  private native double GetUpperBound_7();
  public double GetUpperBound()
  {
    return GetUpperBound_7();
  }

  private native double ComputeMetric_8(vtkDataSet id0,vtkDataArray id1,long id2,vtkAbstractArray id3,long id4);
  public double ComputeMetric(vtkDataSet id0,vtkDataArray id1,long id2,vtkAbstractArray id3,long id4)
  {
    return ComputeMetric_8(id0,id1,id2,id3,id4);
  }

  public vtkReebGraphSimplificationMetric() { super(); }

  public vtkReebGraphSimplificationMetric(long id) { super(id); }
  public native long   VTKInit();

}
