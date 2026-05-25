// java wrapper for vtkContourRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContourRepresentation extends vtkWidgetRepresentation
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

  private native int AddNodeAtWorldPosition_4(double id0,double id1,double id2);
  public int AddNodeAtWorldPosition(double id0,double id1,double id2)
  {
    return AddNodeAtWorldPosition_4(id0,id1,id2);
  }

  private native int AddNodeAtWorldPosition_5(double id0[]);
  public int AddNodeAtWorldPosition(double id0[])
  {
    return AddNodeAtWorldPosition_5(id0);
  }

  private native int AddNodeAtWorldPosition_6(double id0[],double id1[]);
  public int AddNodeAtWorldPosition(double id0[],double id1[])
  {
    return AddNodeAtWorldPosition_6(id0,id1);
  }

  private native int AddNodeAtDisplayPosition_7(double id0[]);
  public int AddNodeAtDisplayPosition(double id0[])
  {
    return AddNodeAtDisplayPosition_7(id0);
  }

  private native int AddNodeAtDisplayPosition_8(int id0[]);
  public int AddNodeAtDisplayPosition(int id0[])
  {
    return AddNodeAtDisplayPosition_8(id0);
  }

  private native int AddNodeAtDisplayPosition_9(int id0,int id1);
  public int AddNodeAtDisplayPosition(int id0,int id1)
  {
    return AddNodeAtDisplayPosition_9(id0,id1);
  }

  private native int ActivateNode_10(double id0[]);
  public int ActivateNode(double id0[])
  {
    return ActivateNode_10(id0);
  }

  private native int ActivateNode_11(int id0[]);
  public int ActivateNode(int id0[])
  {
    return ActivateNode_11(id0);
  }

  private native int ActivateNode_12(int id0,int id1);
  public int ActivateNode(int id0,int id1)
  {
    return ActivateNode_12(id0,id1);
  }

  private native int SetActiveNodeToWorldPosition_13(double id0[]);
  public int SetActiveNodeToWorldPosition(double id0[])
  {
    return SetActiveNodeToWorldPosition_13(id0);
  }

  private native int SetActiveNodeToWorldPosition_14(double id0[],double id1[]);
  public int SetActiveNodeToWorldPosition(double id0[],double id1[])
  {
    return SetActiveNodeToWorldPosition_14(id0,id1);
  }

  private native int SetActiveNodeToDisplayPosition_15(double id0[]);
  public int SetActiveNodeToDisplayPosition(double id0[])
  {
    return SetActiveNodeToDisplayPosition_15(id0);
  }

  private native int SetActiveNodeToDisplayPosition_16(int id0[]);
  public int SetActiveNodeToDisplayPosition(int id0[])
  {
    return SetActiveNodeToDisplayPosition_16(id0);
  }

  private native int SetActiveNodeToDisplayPosition_17(int id0,int id1);
  public int SetActiveNodeToDisplayPosition(int id0,int id1)
  {
    return SetActiveNodeToDisplayPosition_17(id0,id1);
  }

  private native int ToggleActiveNodeSelected_18();
  public int ToggleActiveNodeSelected()
  {
    return ToggleActiveNodeSelected_18();
  }

  private native int GetActiveNodeSelected_19();
  public int GetActiveNodeSelected()
  {
    return GetActiveNodeSelected_19();
  }

  private native int GetNthNodeSelected_20(int id0);
  public int GetNthNodeSelected(int id0)
  {
    return GetNthNodeSelected_20(id0);
  }

  private native int SetNthNodeSelected_21(int id0);
  public int SetNthNodeSelected(int id0)
  {
    return SetNthNodeSelected_21(id0);
  }

  private native int GetActiveNodeWorldPosition_22(double id0[]);
  public int GetActiveNodeWorldPosition(double id0[])
  {
    return GetActiveNodeWorldPosition_22(id0);
  }

  private native int GetActiveNodeWorldOrientation_23(double id0[]);
  public int GetActiveNodeWorldOrientation(double id0[])
  {
    return GetActiveNodeWorldOrientation_23(id0);
  }

  private native int GetActiveNodeDisplayPosition_24(double id0[]);
  public int GetActiveNodeDisplayPosition(double id0[])
  {
    return GetActiveNodeDisplayPosition_24(id0);
  }

  private native int GetNumberOfNodes_25();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_25();
  }

  private native int GetNthNodeDisplayPosition_26(int id0,double id1[]);
  public int GetNthNodeDisplayPosition(int id0,double id1[])
  {
    return GetNthNodeDisplayPosition_26(id0,id1);
  }

  private native int GetNthNodeWorldPosition_27(int id0,double id1[]);
  public int GetNthNodeWorldPosition(int id0,double id1[])
  {
    return GetNthNodeWorldPosition_27(id0,id1);
  }

  private native int GetNthNodeWorldOrientation_28(int id0,double id1[]);
  public int GetNthNodeWorldOrientation(int id0,double id1[])
  {
    return GetNthNodeWorldOrientation_28(id0,id1);
  }

  private native int SetNthNodeDisplayPosition_29(int id0,int id1,int id2);
  public int SetNthNodeDisplayPosition(int id0,int id1,int id2)
  {
    return SetNthNodeDisplayPosition_29(id0,id1,id2);
  }

  private native int SetNthNodeDisplayPosition_30(int id0,int id1[]);
  public int SetNthNodeDisplayPosition(int id0,int id1[])
  {
    return SetNthNodeDisplayPosition_30(id0,id1);
  }

  private native int SetNthNodeDisplayPosition_31(int id0,double id1[]);
  public int SetNthNodeDisplayPosition(int id0,double id1[])
  {
    return SetNthNodeDisplayPosition_31(id0,id1);
  }

  private native int SetNthNodeWorldPosition_32(int id0,double id1[]);
  public int SetNthNodeWorldPosition(int id0,double id1[])
  {
    return SetNthNodeWorldPosition_32(id0,id1);
  }

  private native int SetNthNodeWorldPosition_33(int id0,double id1[],double id2[]);
  public int SetNthNodeWorldPosition(int id0,double id1[],double id2[])
  {
    return SetNthNodeWorldPosition_33(id0,id1,id2);
  }

  private native int GetNthNodeSlope_34(int id0,double id1[]);
  public int GetNthNodeSlope(int id0,double id1[])
  {
    return GetNthNodeSlope_34(id0,id1);
  }

  private native int GetNumberOfIntermediatePoints_35(int id0);
  public int GetNumberOfIntermediatePoints(int id0)
  {
    return GetNumberOfIntermediatePoints_35(id0);
  }

  private native int GetIntermediatePointWorldPosition_36(int id0,int id1,double id2[]);
  public int GetIntermediatePointWorldPosition(int id0,int id1,double id2[])
  {
    return GetIntermediatePointWorldPosition_36(id0,id1,id2);
  }

  private native int AddIntermediatePointWorldPosition_37(int id0,double id1[]);
  public int AddIntermediatePointWorldPosition(int id0,double id1[])
  {
    return AddIntermediatePointWorldPosition_37(id0,id1);
  }

  private native int AddIntermediatePointWorldPosition_38(int id0,double id1[],long id2);
  public int AddIntermediatePointWorldPosition(int id0,double id1[],long id2)
  {
    return AddIntermediatePointWorldPosition_38(id0,id1,id2);
  }

  private native int DeleteLastNode_39();
  public int DeleteLastNode()
  {
    return DeleteLastNode_39();
  }

  private native int DeleteActiveNode_40();
  public int DeleteActiveNode()
  {
    return DeleteActiveNode_40();
  }

  private native int DeleteNthNode_41(int id0);
  public int DeleteNthNode(int id0)
  {
    return DeleteNthNode_41(id0);
  }

  private native void ClearAllNodes_42();
  public void ClearAllNodes()
  {
    ClearAllNodes_42();
  }

  private native int AddNodeOnContour_43(int id0,int id1);
  public int AddNodeOnContour(int id0,int id1)
  {
    return AddNodeOnContour_43(id0,id1);
  }

  private native void SetPixelTolerance_44(int id0);
  public void SetPixelTolerance(int id0)
  {
    SetPixelTolerance_44(id0);
  }

  private native int GetPixelToleranceMinValue_45();
  public int GetPixelToleranceMinValue()
  {
    return GetPixelToleranceMinValue_45();
  }

  private native int GetPixelToleranceMaxValue_46();
  public int GetPixelToleranceMaxValue()
  {
    return GetPixelToleranceMaxValue_46();
  }

  private native int GetPixelTolerance_47();
  public int GetPixelTolerance()
  {
    return GetPixelTolerance_47();
  }

  private native void SetWorldTolerance_48(double id0);
  public void SetWorldTolerance(double id0)
  {
    SetWorldTolerance_48(id0);
  }

  private native double GetWorldToleranceMinValue_49();
  public double GetWorldToleranceMinValue()
  {
    return GetWorldToleranceMinValue_49();
  }

  private native double GetWorldToleranceMaxValue_50();
  public double GetWorldToleranceMaxValue()
  {
    return GetWorldToleranceMaxValue_50();
  }

  private native double GetWorldTolerance_51();
  public double GetWorldTolerance()
  {
    return GetWorldTolerance_51();
  }

  private native int GetCurrentOperation_52();
  public int GetCurrentOperation()
  {
    return GetCurrentOperation_52();
  }

  private native void SetCurrentOperation_53(int id0);
  public void SetCurrentOperation(int id0)
  {
    SetCurrentOperation_53(id0);
  }

  private native int GetCurrentOperationMinValue_54();
  public int GetCurrentOperationMinValue()
  {
    return GetCurrentOperationMinValue_54();
  }

  private native int GetCurrentOperationMaxValue_55();
  public int GetCurrentOperationMaxValue()
  {
    return GetCurrentOperationMaxValue_55();
  }

  private native void SetCurrentOperationToInactive_56();
  public void SetCurrentOperationToInactive()
  {
    SetCurrentOperationToInactive_56();
  }

  private native void SetCurrentOperationToTranslate_57();
  public void SetCurrentOperationToTranslate()
  {
    SetCurrentOperationToTranslate_57();
  }

  private native void SetCurrentOperationToShift_58();
  public void SetCurrentOperationToShift()
  {
    SetCurrentOperationToShift_58();
  }

  private native void SetCurrentOperationToScale_59();
  public void SetCurrentOperationToScale()
  {
    SetCurrentOperationToScale_59();
  }

  private native void SetPointPlacer_60(vtkPointPlacer id0);
  public void SetPointPlacer(vtkPointPlacer id0)
  {
    SetPointPlacer_60(id0);
  }

  private native long GetPointPlacer_61();
  public vtkPointPlacer GetPointPlacer()
  {
    long temp = GetPointPlacer_61();

    if (temp == 0) return null;
    return (vtkPointPlacer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLineInterpolator_62(vtkContourLineInterpolator id0);
  public void SetLineInterpolator(vtkContourLineInterpolator id0)
  {
    SetLineInterpolator_62(id0);
  }

  private native long GetLineInterpolator_63();
  public vtkContourLineInterpolator GetLineInterpolator()
  {
    long temp = GetLineInterpolator_63();

    if (temp == 0) return null;
    return (vtkContourLineInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_64();
  public void BuildRepresentation()
  {
    BuildRepresentation_64();
  }

  private native int ComputeInteractionState_65(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_65(id0,id1,id2);
  }

  private native void StartWidgetInteraction_66(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_66(id0);
  }

  private native void WidgetInteraction_67(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_67(id0);
  }

  private native void ReleaseGraphicsResources_68(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_68(id0);
  }

  private native int RenderOverlay_69(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_69(id0);
  }

  private native int RenderOpaqueGeometry_70(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_70(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_71(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_71(id0);
  }

  private native int HasTranslucentPolygonalGeometry_72();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_72();
  }

  private native void SetClosedLoop_73(int id0);
  public void SetClosedLoop(int id0)
  {
    SetClosedLoop_73(id0);
  }

  private native int GetClosedLoop_74();
  public int GetClosedLoop()
  {
    return GetClosedLoop_74();
  }

  private native void ClosedLoopOn_75();
  public void ClosedLoopOn()
  {
    ClosedLoopOn_75();
  }

  private native void ClosedLoopOff_76();
  public void ClosedLoopOff()
  {
    ClosedLoopOff_76();
  }

  private native void SetShowSelectedNodes_77(int id0);
  public void SetShowSelectedNodes(int id0)
  {
    SetShowSelectedNodes_77(id0);
  }

  private native int GetShowSelectedNodes_78();
  public int GetShowSelectedNodes()
  {
    return GetShowSelectedNodes_78();
  }

  private native void ShowSelectedNodesOn_79();
  public void ShowSelectedNodesOn()
  {
    ShowSelectedNodesOn_79();
  }

  private native void ShowSelectedNodesOff_80();
  public void ShowSelectedNodesOff()
  {
    ShowSelectedNodesOff_80();
  }

  private native long GetContourRepresentationAsPolyData_81();
  public vtkPolyData GetContourRepresentationAsPolyData()
  {
    long temp = GetContourRepresentationAsPolyData_81();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetNodePolyData_82(vtkPolyData id0);
  public void GetNodePolyData(vtkPolyData id0)
  {
    GetNodePolyData_82(id0);
  }

  private native void SetRebuildLocator_83(boolean id0);
  public void SetRebuildLocator(boolean id0)
  {
    SetRebuildLocator_83(id0);
  }

  public vtkContourRepresentation() { super(); }

  public vtkContourRepresentation(long id) { super(id); }

}
