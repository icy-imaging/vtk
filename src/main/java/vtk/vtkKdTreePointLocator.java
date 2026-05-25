// java wrapper for vtkKdTreePointLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKdTreePointLocator extends vtkAbstractPointLocator
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

  private native void FindClosestNPoints_5(int id0,double id1[],vtkIdList id2);
  public void FindClosestNPoints(int id0,double id1[],vtkIdList id2)
  {
    FindClosestNPoints_5(id0,id1,id2);
  }

  private native void FindPointsWithinRadius_6(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinRadius_6(id0,id1,id2);
  }

  private native void FreeSearchStructure_7();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_7();
  }

  private native void BuildLocator_8();
  public void BuildLocator()
  {
    BuildLocator_8();
  }

  private native void ForceBuildLocator_9();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_9();
  }

  private native void GenerateRepresentation_10(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_10(id0,id1);
  }

  public vtkKdTreePointLocator() { super(); }

  public vtkKdTreePointLocator(long id) { super(id); }
  public native long   VTKInit();

}
