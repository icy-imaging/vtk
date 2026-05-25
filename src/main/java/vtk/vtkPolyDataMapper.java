// java wrapper for vtkPolyDataMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataMapper extends vtkMapper
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

  private native void RenderPiece_4(vtkRenderer id0,vtkActor id1);
  public void RenderPiece(vtkRenderer id0,vtkActor id1)
  {
    RenderPiece_4(id0,id1);
  }

  private native void Render_5(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_5(id0,id1);
  }

  private native void SetInputData_6(vtkPolyData id0);
  public void SetInputData(vtkPolyData id0)
  {
    SetInputData_6(id0);
  }

  private native long GetInput_7();
  public vtkPolyData GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_8(int id0);
  public void Update(int id0)
  {
    Update_8(id0);
  }

  private native void Update_9();
  public void Update()
  {
    Update_9();
  }

  private native int Update_10(int id0,vtkInformationVector id1);
  public int Update(int id0,vtkInformationVector id1)
  {
    return Update_10(id0,id1);
  }

  private native int Update_11(vtkInformation id0);
  public int Update(vtkInformation id0)
  {
    return Update_11(id0);
  }

  private native void SetPiece_12(int id0);
  public void SetPiece(int id0)
  {
    SetPiece_12(id0);
  }

  private native int GetPiece_13();
  public int GetPiece()
  {
    return GetPiece_13();
  }

  private native void SetNumberOfPieces_14(int id0);
  public void SetNumberOfPieces(int id0)
  {
    SetNumberOfPieces_14(id0);
  }

  private native int GetNumberOfPieces_15();
  public int GetNumberOfPieces()
  {
    return GetNumberOfPieces_15();
  }

  private native void SetNumberOfSubPieces_16(int id0);
  public void SetNumberOfSubPieces(int id0)
  {
    SetNumberOfSubPieces_16(id0);
  }

  private native int GetNumberOfSubPieces_17();
  public int GetNumberOfSubPieces()
  {
    return GetNumberOfSubPieces_17();
  }

  private native void SetGhostLevel_18(int id0);
  public void SetGhostLevel(int id0)
  {
    SetGhostLevel_18(id0);
  }

  private native int GetGhostLevel_19();
  public int GetGhostLevel()
  {
    return GetGhostLevel_19();
  }

  private native void SetSeamlessU_20(boolean id0);
  public void SetSeamlessU(boolean id0)
  {
    SetSeamlessU_20(id0);
  }

  private native boolean GetSeamlessU_21();
  public boolean GetSeamlessU()
  {
    return GetSeamlessU_21();
  }

  private native void SeamlessUOn_22();
  public void SeamlessUOn()
  {
    SeamlessUOn_22();
  }

  private native void SeamlessUOff_23();
  public void SeamlessUOff()
  {
    SeamlessUOff_23();
  }

  private native void SetSeamlessV_24(boolean id0);
  public void SetSeamlessV(boolean id0)
  {
    SetSeamlessV_24(id0);
  }

  private native boolean GetSeamlessV_25();
  public boolean GetSeamlessV()
  {
    return GetSeamlessV_25();
  }

  private native void SeamlessVOn_26();
  public void SeamlessVOn()
  {
    SeamlessVOn_26();
  }

  private native void SeamlessVOff_27();
  public void SeamlessVOff()
  {
    SeamlessVOff_27();
  }

  private native double[] GetBounds_28();
  public double[] GetBounds()
  {
    return GetBounds_28();
  }

  private native void GetBounds_29(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_29(id0);
  }

  private native void ShallowCopy_30(vtkAbstractMapper id0);
  public void ShallowCopy(vtkAbstractMapper id0)
  {
    ShallowCopy_30(id0);
  }

  private native void MapDataArrayToVertexAttribute_31(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public void MapDataArrayToVertexAttribute(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    MapDataArrayToVertexAttribute_31(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native void MapDataArrayToMultiTextureAttribute_32(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public void MapDataArrayToMultiTextureAttribute(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    MapDataArrayToMultiTextureAttribute_32(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native void RemoveVertexAttributeMapping_33(byte[] id0, int len0);
  public void RemoveVertexAttributeMapping(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveVertexAttributeMapping_33(bytes0, bytes0.length);
  }

  private native void RemoveAllVertexAttributeMappings_34();
  public void RemoveAllVertexAttributeMappings()
  {
    RemoveAllVertexAttributeMappings_34();
  }

  private native void SetVBOShiftScaleMethod_35(int id0);
  public void SetVBOShiftScaleMethod(int id0)
  {
    SetVBOShiftScaleMethod_35(id0);
  }

  private native int GetVBOShiftScaleMethod_36();
  public int GetVBOShiftScaleMethod()
  {
    return GetVBOShiftScaleMethod_36();
  }

  private native void SetPauseShiftScale_37(boolean id0);
  public void SetPauseShiftScale(boolean id0)
  {
    SetPauseShiftScale_37(id0);
  }

  private native boolean GetPauseShiftScale_38();
  public boolean GetPauseShiftScale()
  {
    return GetPauseShiftScale_38();
  }

  private native void PauseShiftScaleOn_39();
  public void PauseShiftScaleOn()
  {
    PauseShiftScaleOn_39();
  }

  private native void PauseShiftScaleOff_40();
  public void PauseShiftScaleOff()
  {
    PauseShiftScaleOff_40();
  }

  public vtkPolyDataMapper() { super(); }

  public vtkPolyDataMapper(long id) { super(id); }
  public native long   VTKInit();

}
