// java wrapper for vtkHardwareSelector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHardwareSelector extends vtkObject
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native long GetRenderer_5();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_5();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetArea_6(int id0,int id1,int id2,int id3);
  public void SetArea(int id0,int id1,int id2,int id3)
  {
    SetArea_6(id0,id1,id2,id3);
  }

  private native void SetFieldAssociation_7(int id0);
  public void SetFieldAssociation(int id0)
  {
    SetFieldAssociation_7(id0);
  }

  private native int GetFieldAssociation_8();
  public int GetFieldAssociation()
  {
    return GetFieldAssociation_8();
  }

  private native void SetUseProcessIdFromData_9(boolean id0);
  public void SetUseProcessIdFromData(boolean id0)
  {
    SetUseProcessIdFromData_9(id0);
  }

  private native boolean GetUseProcessIdFromData_10();
  public boolean GetUseProcessIdFromData()
  {
    return GetUseProcessIdFromData_10();
  }

  private native long Select_11();
  public vtkSelection Select()
  {
    long temp = Select_11();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean CaptureBuffers_12();
  public boolean CaptureBuffers()
  {
    return CaptureBuffers_12();
  }

  private native void ClearBuffers_13();
  public void ClearBuffers()
  {
    ClearBuffers_13();
  }

  private native void RenderCompositeIndex_14(int id0);
  public void RenderCompositeIndex(int id0)
  {
    RenderCompositeIndex_14(id0);
  }

  private native void UpdateMaximumCellId_15(long id0);
  public void UpdateMaximumCellId(long id0)
  {
    UpdateMaximumCellId_15(id0);
  }

  private native void UpdateMaximumPointId_16(long id0);
  public void UpdateMaximumPointId(long id0)
  {
    UpdateMaximumPointId_16(id0);
  }

  private native void UpdateMaximumCellGridTupleId_17(long id0);
  public void UpdateMaximumCellGridTupleId(long id0)
  {
    UpdateMaximumCellGridTupleId_17(id0);
  }

  private native void RenderProcessId_18(int id0);
  public void RenderProcessId(int id0)
  {
    RenderProcessId_18(id0);
  }

  private native boolean GetActorPassOnly_19();
  public boolean GetActorPassOnly()
  {
    return GetActorPassOnly_19();
  }

  private native void SetActorPassOnly_20(boolean id0);
  public void SetActorPassOnly(boolean id0)
  {
    SetActorPassOnly_20(id0);
  }

  private native boolean GetCaptureZValues_21();
  public boolean GetCaptureZValues()
  {
    return GetCaptureZValues_21();
  }

  private native void SetCaptureZValues_22(boolean id0);
  public void SetCaptureZValues(boolean id0)
  {
    SetCaptureZValues_22(id0);
  }

  private native void BeginRenderProp_23();
  public void BeginRenderProp()
  {
    BeginRenderProp_23();
  }

  private native void EndRenderProp_24();
  public void EndRenderProp()
  {
    EndRenderProp_24();
  }

  private native void SetProcessID_25(int id0);
  public void SetProcessID(int id0)
  {
    SetProcessID_25(id0);
  }

  private native int GetProcessID_26();
  public int GetProcessID()
  {
    return GetProcessID_26();
  }

  private native float[] GetPropColorValue_27();
  public float[] GetPropColorValue()
  {
    return GetPropColorValue_27();
  }

  private native void SetPropColorValue_28(float id0,float id1,float id2);
  public void SetPropColorValue(float id0,float id1,float id2)
  {
    SetPropColorValue_28(id0,id1,id2);
  }

  private native void SetPropColorValue_29(float id0[]);
  public void SetPropColorValue(float id0[])
  {
    SetPropColorValue_29(id0);
  }

  private native void SetPropColorValue_30(long id0);
  public void SetPropColorValue(long id0)
  {
    SetPropColorValue_30(id0);
  }

  private native int GetCurrentPass_31();
  public int GetCurrentPass()
  {
    return GetCurrentPass_31();
  }

  private native long GenerateSelection_32();
  public vtkSelection GenerateSelection()
  {
    long temp = GenerateSelection_32();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GenerateSelection_33(int id0,int id1,int id2,int id3);
  public vtkSelection GenerateSelection(int id0,int id1,int id2,int id3)
  {
    long temp = GenerateSelection_33(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPropFromID_34(int id0);
  public vtkProp GetPropFromID(int id0)
  {
    long temp = GetPropFromID_34(id0);

    if (temp == 0) return null;
    return (vtkProp)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] PassTypeToString_35(int id0);
  public String PassTypeToString(int id0)
  {
    return new String(PassTypeToString_35(id0), StandardCharsets.UTF_8);
  }

  private native void Convert_36(long id0,float id1[]);
  public void Convert(long id0,float id1[])
  {
    Convert_36(id0,id1);
  }

  private native void SavePixelBuffer_37(int id0);
  public void SavePixelBuffer(int id0)
  {
    SavePixelBuffer_37(id0);
  }

  private native boolean HasHighCellIds_38();
  public boolean HasHighCellIds()
  {
    return HasHighCellIds_38();
  }

  private native boolean HasHighPointIds_39();
  public boolean HasHighPointIds()
  {
    return HasHighPointIds_39();
  }

  private native boolean HasHighCellGridTupleIds_40();
  public boolean HasHighCellGridTupleIds()
  {
    return HasHighCellGridTupleIds_40();
  }

  public vtkHardwareSelector() { super(); }

  public vtkHardwareSelector(long id) { super(id); }
  public native long   VTKInit();

}
