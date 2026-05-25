// java wrapper for vtkKdNode object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkKdNode extends vtkObject
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

  private native void SetDim_4(int id0);
  public void SetDim(int id0)
  {
    SetDim_4(id0);
  }

  private native int GetDim_5();
  public int GetDim()
  {
    return GetDim_5();
  }

  private native double GetDivisionPosition_6();
  public double GetDivisionPosition()
  {
    return GetDivisionPosition_6();
  }

  private native void SetNumberOfPoints_7(int id0);
  public void SetNumberOfPoints(int id0)
  {
    SetNumberOfPoints_7(id0);
  }

  private native int GetNumberOfPoints_8();
  public int GetNumberOfPoints()
  {
    return GetNumberOfPoints_8();
  }

  private native void SetBounds_9(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_9(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_10(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_10(id0);
  }

  private native void SetDataBounds_11(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetDataBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetDataBounds_11(id0,id1,id2,id3,id4,id5);
  }

  private native double[] GetMinBounds_12();
  public double[] GetMinBounds()
  {
    return GetMinBounds_12();
  }

  private native double[] GetMaxBounds_13();
  public double[] GetMaxBounds()
  {
    return GetMaxBounds_13();
  }

  private native double[] GetMinDataBounds_14();
  public double[] GetMinDataBounds()
  {
    return GetMinDataBounds_14();
  }

  private native double[] GetMaxDataBounds_15();
  public double[] GetMaxDataBounds()
  {
    return GetMaxDataBounds_15();
  }

  private native void SetID_16(int id0);
  public void SetID(int id0)
  {
    SetID_16(id0);
  }

  private native int GetID_17();
  public int GetID()
  {
    return GetID_17();
  }

  private native int GetMinID_18();
  public int GetMinID()
  {
    return GetMinID_18();
  }

  private native int GetMaxID_19();
  public int GetMaxID()
  {
    return GetMaxID_19();
  }

  private native void SetMinID_20(int id0);
  public void SetMinID(int id0)
  {
    SetMinID_20(id0);
  }

  private native void SetMaxID_21(int id0);
  public void SetMaxID(int id0)
  {
    SetMaxID_21(id0);
  }

  private native void AddChildNodes_22(vtkKdNode id0,vtkKdNode id1);
  public void AddChildNodes(vtkKdNode id0,vtkKdNode id1)
  {
    AddChildNodes_22(id0,id1);
  }

  private native void DeleteChildNodes_23();
  public void DeleteChildNodes()
  {
    DeleteChildNodes_23();
  }

  private native long GetLeft_24();
  public vtkKdNode GetLeft()
  {
    long temp = GetLeft_24();

    if (temp == 0) return null;
    return (vtkKdNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLeft_25(vtkKdNode id0);
  public void SetLeft(vtkKdNode id0)
  {
    SetLeft_25(id0);
  }

  private native long GetRight_26();
  public vtkKdNode GetRight()
  {
    long temp = GetRight_26();

    if (temp == 0) return null;
    return (vtkKdNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRight_27(vtkKdNode id0);
  public void SetRight(vtkKdNode id0)
  {
    SetRight_27(id0);
  }

  private native long GetUp_28();
  public vtkKdNode GetUp()
  {
    long temp = GetUp_28();

    if (temp == 0) return null;
    return (vtkKdNode)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUp_29(vtkKdNode id0);
  public void SetUp(vtkKdNode id0)
  {
    SetUp_29(id0);
  }

  private native int IntersectsBox_30(double id0,double id1,double id2,double id3,double id4,double id5,int id6);
  public int IntersectsBox(double id0,double id1,double id2,double id3,double id4,double id5,int id6)
  {
    return IntersectsBox_30(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int IntersectsSphere2_31(double id0,double id1,double id2,double id3,int id4);
  public int IntersectsSphere2(double id0,double id1,double id2,double id3,int id4)
  {
    return IntersectsSphere2_31(id0,id1,id2,id3,id4);
  }

  private native int IntersectsRegion_32(vtkPlanesIntersection id0,int id1);
  public int IntersectsRegion(vtkPlanesIntersection id0,int id1)
  {
    return IntersectsRegion_32(id0,id1);
  }

  private native int ContainsBox_33(double id0,double id1,double id2,double id3,double id4,double id5,int id6);
  public int ContainsBox(double id0,double id1,double id2,double id3,double id4,double id5,int id6)
  {
    return ContainsBox_33(id0,id1,id2,id3,id4,id5,id6);
  }

  private native int ContainsPoint_34(double id0,double id1,double id2,int id3);
  public int ContainsPoint(double id0,double id1,double id2,int id3)
  {
    return ContainsPoint_34(id0,id1,id2,id3);
  }

  private native double GetDistance2ToBoundary_35(double id0,double id1,double id2,int id3);
  public double GetDistance2ToBoundary(double id0,double id1,double id2,int id3)
  {
    return GetDistance2ToBoundary_35(id0,id1,id2,id3);
  }

  private native double GetDistance2ToInnerBoundary_36(double id0,double id1,double id2);
  public double GetDistance2ToInnerBoundary(double id0,double id1,double id2)
  {
    return GetDistance2ToInnerBoundary_36(id0,id1,id2);
  }

  private native void PrintNode_37(int id0);
  public void PrintNode(int id0)
  {
    PrintNode_37(id0);
  }

  private native void PrintVerboseNode_38(int id0);
  public void PrintVerboseNode(int id0)
  {
    PrintVerboseNode_38(id0);
  }

  public vtkKdNode() { super(); }

  public vtkKdNode(long id) { super(id); }
  public native long   VTKInit();

}
