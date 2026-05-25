// java wrapper for vtkOctreePointLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOctreePointLocator extends vtkAbstractPointLocator
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

  private native void SetMaximumPointsPerRegion_4(int id0);
  public void SetMaximumPointsPerRegion(int id0)
  {
    SetMaximumPointsPerRegion_4(id0);
  }

  private native int GetMaximumPointsPerRegion_5();
  public int GetMaximumPointsPerRegion()
  {
    return GetMaximumPointsPerRegion_5();
  }

  private native void SetCreateCubicOctants_6(int id0);
  public void SetCreateCubicOctants(int id0)
  {
    SetCreateCubicOctants_6(id0);
  }

  private native int GetCreateCubicOctants_7();
  public int GetCreateCubicOctants()
  {
    return GetCreateCubicOctants_7();
  }

  private native double GetFudgeFactor_8();
  public double GetFudgeFactor()
  {
    return GetFudgeFactor_8();
  }

  private native void SetFudgeFactor_9(double id0);
  public void SetFudgeFactor(double id0)
  {
    SetFudgeFactor_9(id0);
  }

  private native int GetNumberOfLeafNodes_10();
  public int GetNumberOfLeafNodes()
  {
    return GetNumberOfLeafNodes_10();
  }

  private native void GetRegionBounds_11(int id0,double id1[]);
  public void GetRegionBounds(int id0,double id1[])
  {
    GetRegionBounds_11(id0,id1);
  }

  private native void GetRegionDataBounds_12(int id0,double id1[]);
  public void GetRegionDataBounds(int id0,double id1[])
  {
    GetRegionDataBounds_12(id0,id1);
  }

  private native int GetRegionContainingPoint_13(double id0,double id1,double id2);
  public int GetRegionContainingPoint(double id0,double id1,double id2)
  {
    return GetRegionContainingPoint_13(id0,id1,id2);
  }

  private native void BuildLocator_14();
  public void BuildLocator()
  {
    BuildLocator_14();
  }

  private native void ForceBuildLocator_15();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_15();
  }

  private native long FindClosestPoint_16(double id0[]);
  public long FindClosestPoint(double id0[])
  {
    return FindClosestPoint_16(id0);
  }

  private native void FindPointsWithinRadius_17(double id0,double id1[],vtkIdList id2);
  public void FindPointsWithinRadius(double id0,double id1[],vtkIdList id2)
  {
    FindPointsWithinRadius_17(id0,id1,id2);
  }

  private native void FindClosestNPoints_18(int id0,double id1[],vtkIdList id2);
  public void FindClosestNPoints(int id0,double id1[],vtkIdList id2)
  {
    FindClosestNPoints_18(id0,id1,id2);
  }

  private native long GetPointsInRegion_19(int id0);
  public vtkIdTypeArray GetPointsInRegion(int id0)
  {
    long temp = GetPointsInRegion_19(id0);

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void FreeSearchStructure_20();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_20();
  }

  private native void GenerateRepresentation_21(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_21(id0,id1);
  }

  public vtkOctreePointLocator() { super(); }

  public vtkOctreePointLocator(long id) { super(id); }
  public native long   VTKInit();

}
