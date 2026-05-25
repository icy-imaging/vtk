// java wrapper for vtkAbstractPointLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractPointLocator extends vtkLocator
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

  private native long FindClosestPoint_4(double id0[]);
  public long FindClosestPoint(double id0[])
  {
    return FindClosestPoint_4(id0);
  }

  private native long FindClosestPoint_5(double id0,double id1,double id2);
  public long FindClosestPoint(double id0,double id1,double id2)
  {
    return FindClosestPoint_5(id0,id1,id2);
  }

  private native void FindClosestNPoints_6(int id0,double id1[],vtkIdList id2);
  public void FindClosestNPoints(int id0,double id1[],vtkIdList id2)
  {
    FindClosestNPoints_6(id0,id1,id2);
  }

  private native void FindClosestNPoints_7(int id0,double id1,double id2,double id3,vtkIdList id4);
  public void FindClosestNPoints(int id0,double id1,double id2,double id3,vtkIdList id4)
  {
    FindClosestNPoints_7(id0,id1,id2,id3,id4);
  }

  private native void FindPointsWithinRadius_8(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinRadius_8(id0,id1,id2);
  }

  private native void FindPointsWithinRadius_9(double id0,double id1,double id2,double id3,vtkIdList id4);
  public void FindPointsWithinRadius(double id0,double id1,double id2,double id3,vtkIdList id4)
  {
    FindPointsWithinRadius_9(id0,id1,id2,id3,id4);
  }

  private native long GetNumberOfBuckets_10();
  public long GetNumberOfBuckets()
  {
    return GetNumberOfBuckets_10();
  }

  public vtkAbstractPointLocator() { super(); }

  public vtkAbstractPointLocator(long id) { super(id); }

}
