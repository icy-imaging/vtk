// java wrapper for vtkBSPIntersections object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBSPIntersections extends vtkObject
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

  private native void SetCuts_4(vtkBSPCuts id0);
  public void SetCuts(vtkBSPCuts id0)
  {
    SetCuts_4(id0);
  }

  private native long GetCuts_5();
  public vtkBSPCuts GetCuts()
  {
    long temp = GetCuts_5();

    if (temp == 0) return null;
    return (vtkBSPCuts)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfRegions_6();
  public int GetNumberOfRegions()
  {
    return GetNumberOfRegions_6();
  }

  private native int GetRegionBounds_7(int id0,double id1[]);
  public int GetRegionBounds(int id0,double id1[])
  {
    return GetRegionBounds_7(id0,id1);
  }

  private native int GetRegionDataBounds_8(int id0,double id1[]);
  public int GetRegionDataBounds(int id0,double id1[])
  {
    return GetRegionDataBounds_8(id0,id1);
  }

  private native int IntersectsBox_9(int id0,double id1,double id2,double id3,double id4,double id5,double id6);
  public int IntersectsBox(int id0,double id1,double id2,double id3,double id4,double id5,double id6)
  {
    return IntersectsBox_9(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int IntersectsSphere2_10(int id0,double id1,double id2,double id3,double id4);
  public int IntersectsSphere2(int id0,double id1,double id2,double id3,double id4)
  {
    return IntersectsSphere2_10(id0,id1,id2,id3,id4);
  }

  private native int IntersectsCell_11(int id0,vtkCell id1,int id2);
  public int IntersectsCell(int id0,vtkCell id1,int id2)
  {
    return IntersectsCell_11(id0,id1,id2);
  }

  private native int GetComputeIntersectionsUsingDataBounds_12();
  public int GetComputeIntersectionsUsingDataBounds()
  {
    return GetComputeIntersectionsUsingDataBounds_12();
  }

  private native void SetComputeIntersectionsUsingDataBounds_13(int id0);
  public void SetComputeIntersectionsUsingDataBounds(int id0)
  {
    SetComputeIntersectionsUsingDataBounds_13(id0);
  }

  private native void ComputeIntersectionsUsingDataBoundsOn_14();
  public void ComputeIntersectionsUsingDataBoundsOn()
  {
    ComputeIntersectionsUsingDataBoundsOn_14();
  }

  private native void ComputeIntersectionsUsingDataBoundsOff_15();
  public void ComputeIntersectionsUsingDataBoundsOff()
  {
    ComputeIntersectionsUsingDataBoundsOff_15();
  }

  public vtkBSPIntersections() { super(); }

  public vtkBSPIntersections(long id) { super(id); }
  public native long   VTKInit();

}
