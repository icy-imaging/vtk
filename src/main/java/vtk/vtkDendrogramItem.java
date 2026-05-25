// java wrapper for vtkDendrogramItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDendrogramItem extends vtkContextItem
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

  private native void SetTree_4(vtkTree id0);
  public void SetTree(vtkTree id0)
  {
    SetTree_4(id0);
  }

  private native long GetTree_5();
  public vtkTree GetTree()
  {
    long temp = GetTree_5();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CollapseToNumberOfLeafNodes_6(int id0);
  public void CollapseToNumberOfLeafNodes(int id0)
  {
    CollapseToNumberOfLeafNodes_6(id0);
  }

  private native long GetPrunedTree_7();
  public vtkTree GetPrunedTree()
  {
    long temp = GetPrunedTree_7();

    if (temp == 0) return null;
    return (vtkTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetColorArray_8(byte[] id0, int len0);
  public void SetColorArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetColorArray_8(bytes0, bytes0.length);
  }

  private native void SetExtendLeafNodes_9(boolean id0);
  public void SetExtendLeafNodes(boolean id0)
  {
    SetExtendLeafNodes_9(id0);
  }

  private native boolean GetExtendLeafNodes_10();
  public boolean GetExtendLeafNodes()
  {
    return GetExtendLeafNodes_10();
  }

  private native void ExtendLeafNodesOn_11();
  public void ExtendLeafNodesOn()
  {
    ExtendLeafNodesOn_11();
  }

  private native void ExtendLeafNodesOff_12();
  public void ExtendLeafNodesOff()
  {
    ExtendLeafNodesOff_12();
  }

  private native void SetOrientation_13(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_13(id0);
  }

  private native int GetOrientation_14();
  public int GetOrientation()
  {
    return GetOrientation_14();
  }

  private native double GetAngleForOrientation_15(int id0);
  public double GetAngleForOrientation(int id0)
  {
    return GetAngleForOrientation_15(id0);
  }

  private native double GetTextAngleForOrientation_16(int id0);
  public double GetTextAngleForOrientation(int id0)
  {
    return GetTextAngleForOrientation_16(id0);
  }

  private native void SetDrawLabels_17(boolean id0);
  public void SetDrawLabels(boolean id0)
  {
    SetDrawLabels_17(id0);
  }

  private native boolean GetDrawLabels_18();
  public boolean GetDrawLabels()
  {
    return GetDrawLabels_18();
  }

  private native void DrawLabelsOn_19();
  public void DrawLabelsOn()
  {
    DrawLabelsOn_19();
  }

  private native void DrawLabelsOff_20();
  public void DrawLabelsOff()
  {
    DrawLabelsOff_20();
  }

  private native void SetPosition_21(float id0,float id1);
  public void SetPosition(float id0,float id1)
  {
    SetPosition_21(id0,id1);
  }

  private native void SetPosition_22(float id0[]);
  public void SetPosition(float id0[])
  {
    SetPosition_22(id0);
  }

  private native float[] GetPosition_23();
  public float[] GetPosition()
  {
    return GetPosition_23();
  }

  private native double GetLeafSpacing_24();
  public double GetLeafSpacing()
  {
    return GetLeafSpacing_24();
  }

  private native void SetLeafSpacing_25(double id0);
  public void SetLeafSpacing(double id0)
  {
    SetLeafSpacing_25(id0);
  }

  private native void PrepareToPaint_26(vtkContext2D id0);
  public void PrepareToPaint(vtkContext2D id0)
  {
    PrepareToPaint_26(id0);
  }

  private native void GetBounds_27(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_27(id0);
  }

  private native void ComputeLabelWidth_28(vtkContext2D id0);
  public void ComputeLabelWidth(vtkContext2D id0)
  {
    ComputeLabelWidth_28(id0);
  }

  private native float GetLabelWidth_29();
  public float GetLabelWidth()
  {
    return GetLabelWidth_29();
  }

  private native boolean GetPositionOfVertex_30(byte[] id0, int len0,double id1[]);
  public boolean GetPositionOfVertex(String id0,double id1[])
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPositionOfVertex_30(bytes0, bytes0.length,id1);
  }

  private native boolean Paint_31(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_31(id0);
  }

  private native float GetLineWidth_32();
  public float GetLineWidth()
  {
    return GetLineWidth_32();
  }

  private native void SetLineWidth_33(float id0);
  public void SetLineWidth(float id0)
  {
    SetLineWidth_33(id0);
  }

  private native void SetDisplayNumberOfCollapsedLeafNodes_34(boolean id0);
  public void SetDisplayNumberOfCollapsedLeafNodes(boolean id0)
  {
    SetDisplayNumberOfCollapsedLeafNodes_34(id0);
  }

  private native boolean GetDisplayNumberOfCollapsedLeafNodes_35();
  public boolean GetDisplayNumberOfCollapsedLeafNodes()
  {
    return GetDisplayNumberOfCollapsedLeafNodes_35();
  }

  private native void DisplayNumberOfCollapsedLeafNodesOn_36();
  public void DisplayNumberOfCollapsedLeafNodesOn()
  {
    DisplayNumberOfCollapsedLeafNodesOn_36();
  }

  private native void DisplayNumberOfCollapsedLeafNodesOff_37();
  public void DisplayNumberOfCollapsedLeafNodesOff()
  {
    DisplayNumberOfCollapsedLeafNodesOff_37();
  }

  private native byte[] GetDistanceArrayName_38();
  public String GetDistanceArrayName()
  {
    return new String(GetDistanceArrayName_38(), StandardCharsets.UTF_8);
  }

  private native void SetDistanceArrayName_39(byte[] id0, int len0);
  public void SetDistanceArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDistanceArrayName_39(bytes0, bytes0.length);
  }

  private native byte[] GetVertexNameArrayName_40();
  public String GetVertexNameArrayName()
  {
    return new String(GetVertexNameArrayName_40(), StandardCharsets.UTF_8);
  }

  private native void SetVertexNameArrayName_41(byte[] id0, int len0);
  public void SetVertexNameArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexNameArrayName_41(bytes0, bytes0.length);
  }

  public vtkDendrogramItem() { super(); }

  public vtkDendrogramItem(long id) { super(id); }
  public native long   VTKInit();

}
