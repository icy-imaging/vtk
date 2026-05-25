// java wrapper for vtkOctreePointLocatorNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOctreePointLocatorNode extends vtkObject
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

  private native void SetNumberOfPoints_4(int id0);
  public void SetNumberOfPoints(int id0)
  {
    SetNumberOfPoints_4(id0);
  }

  private native int GetNumberOfPoints_5();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_5();
  }

  private native void SetBounds_6(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_7(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_7(id0);
  }

  private native void SetDataBounds_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetDataBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetDataBounds_8(id0,id1,id2,id3,id4,id5);
  }

  private native void SetMinBounds_9(double id0[]);
  public void SetMinBounds(double id0[])
  {
    SetMinBounds_9(id0);
  }

  private native void SetMaxBounds_10(double id0[]);
  public void SetMaxBounds(double id0[])
  {
    SetMaxBounds_10(id0);
  }

  private native void SetMinDataBounds_11(double id0[]);
  public void SetMinDataBounds(double id0[])
  {
    SetMinDataBounds_11(id0);
  }

  private native void SetMaxDataBounds_12(double id0[]);
  public void SetMaxDataBounds(double id0[])
  {
    SetMaxDataBounds_12(id0);
  }

  private native int GetID_13();
  public int GetID()
  {
    return GetID_13();
  }

  private native int GetMinID_14();
  public int GetMinID()
  {
    return GetMinID_14();
  }

  private native void CreateChildNodes_15();
  public void CreateChildNodes()
  {
    CreateChildNodes_15();
  }

  private native void DeleteChildNodes_16();
  public void DeleteChildNodes()
  {
    DeleteChildNodes_16();
  }

  private native long GetChild_17(int id0);
  public vtkOctreePointLocatorNode GetChild(int id0)
  {
    long temp = GetChild_17(id0);

    if (temp == 0) return null;
    return (vtkOctreePointLocatorNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int IntersectsRegion_18(vtkPlanesIntersection id0,int id1);
  public int IntersectsRegion(vtkPlanesIntersection id0,int id1)
  {
    return IntersectsRegion_18(id0,id1);
  }

  private native int ContainsPoint_19(double id0,double id1,double id2,int id3);
  public int ContainsPoint(double id0,double id1,double id2,int id3)
  {
    return ContainsPoint_19(id0,id1,id2,id3);
  }

  private native double GetDistance2ToBoundary_20(double id0,double id1,double id2,vtkOctreePointLocatorNode id3,int id4);
  public double GetDistance2ToBoundary(double id0,double id1,double id2,vtkOctreePointLocatorNode id3,int id4)
  {
    return GetDistance2ToBoundary_20(id0,id1,id2,id3,id4);
  }

  private native double GetDistance2ToInnerBoundary_21(double id0,double id1,double id2,vtkOctreePointLocatorNode id3);
  public double GetDistance2ToInnerBoundary(double id0,double id1,double id2,vtkOctreePointLocatorNode id3)
  {
    return GetDistance2ToInnerBoundary_21(id0,id1,id2,id3);
  }

  public vtkOctreePointLocatorNode() { super(); }

  public vtkOctreePointLocatorNode(long id) { super(id); }
  public native long   VTKInit();

}
