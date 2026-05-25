// java wrapper for vtkUnstructuredGridVolumeRayCastIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridVolumeRayCastIterator extends vtkObject
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

  private native void Initialize_4(int id0,int id1);
  public void Initialize(int id0,int id1)
  {
    Initialize_4(id0,id1);
  }

  private native long GetNextIntersections_5(vtkIdList id0,vtkDoubleArray id1,vtkDataArray id2,vtkDataArray id3,vtkDataArray id4);
  public long GetNextIntersections(vtkIdList id0,vtkDoubleArray id1,vtkDataArray id2,vtkDataArray id3,vtkDataArray id4)
  {
    return GetNextIntersections_5(id0,id1,id2,id3,id4);
  }

  private native void SetBounds_6(double id0,double id1);
  public void SetBounds(double id0,double id1)
  {
    SetBounds_6(id0,id1);
  }

  private native void SetBounds_7(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_7(id0);
  }

  private native double[] GetBounds_8();
  public double[] GetBounds()
  {
    return GetBounds_8();
  }

  private native void SetMaxNumberOfIntersections_9(long id0);
  public void SetMaxNumberOfIntersections(long id0)
  {
    SetMaxNumberOfIntersections_9(id0);
  }

  private native long GetMaxNumberOfIntersections_10();
  public long GetMaxNumberOfIntersections()
  {
    return GetMaxNumberOfIntersections_10();
  }

  public vtkUnstructuredGridVolumeRayCastIterator() { super(); }

  public vtkUnstructuredGridVolumeRayCastIterator(long id) { super(id); }

}
