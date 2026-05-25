// java wrapper for vtkExtractCTHPart object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractCTHPart extends vtkMultiBlockDataSetAlgorithm
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

  private native void AddVolumeArrayName_4(byte[] id0, int len0);
  public void AddVolumeArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddVolumeArrayName_4(bytes0, bytes0.length);
  }

  private native void RemoveVolumeArrayNames_5();
  public void RemoveVolumeArrayNames()
  {
    RemoveVolumeArrayNames_5();
  }

  private native int GetNumberOfVolumeArrayNames_6();
  public int GetNumberOfVolumeArrayNames()
  {
    return GetNumberOfVolumeArrayNames_6();
  }

  private native byte[] GetVolumeArrayName_7(int id0);
  public String GetVolumeArrayName(int id0)
  {
    return new String(GetVolumeArrayName_7(id0), StandardCharsets.UTF_8);
  }

  private native void SetController_8(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_8(id0);
  }

  private native long GetController_9();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_9();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCapping_10(boolean id0);
  public void SetCapping(boolean id0)
  {
    SetCapping_10(id0);
  }

  private native boolean GetCapping_11();
  public boolean GetCapping()
  {
    return GetCapping_11();
  }

  private native void CappingOn_12();
  public void CappingOn()
  {
    CappingOn_12();
  }

  private native void CappingOff_13();
  public void CappingOff()
  {
    CappingOff_13();
  }

  private native void SetGenerateTriangles_14(boolean id0);
  public void SetGenerateTriangles(boolean id0)
  {
    SetGenerateTriangles_14(id0);
  }

  private native boolean GetGenerateTriangles_15();
  public boolean GetGenerateTriangles()
  {
    return GetGenerateTriangles_15();
  }

  private native void GenerateTrianglesOn_16();
  public void GenerateTrianglesOn()
  {
    GenerateTrianglesOn_16();
  }

  private native void GenerateTrianglesOff_17();
  public void GenerateTrianglesOff()
  {
    GenerateTrianglesOff_17();
  }

  private native void SetGenerateSolidGeometry_18(boolean id0);
  public void SetGenerateSolidGeometry(boolean id0)
  {
    SetGenerateSolidGeometry_18(id0);
  }

  private native boolean GetGenerateSolidGeometry_19();
  public boolean GetGenerateSolidGeometry()
  {
    return GetGenerateSolidGeometry_19();
  }

  private native void GenerateSolidGeometryOn_20();
  public void GenerateSolidGeometryOn()
  {
    GenerateSolidGeometryOn_20();
  }

  private native void GenerateSolidGeometryOff_21();
  public void GenerateSolidGeometryOff()
  {
    GenerateSolidGeometryOff_21();
  }

  private native void SetRemoveGhostCells_22(boolean id0);
  public void SetRemoveGhostCells(boolean id0)
  {
    SetRemoveGhostCells_22(id0);
  }

  private native boolean GetRemoveGhostCells_23();
  public boolean GetRemoveGhostCells()
  {
    return GetRemoveGhostCells_23();
  }

  private native void RemoveGhostCellsOn_24();
  public void RemoveGhostCellsOn()
  {
    RemoveGhostCellsOn_24();
  }

  private native void RemoveGhostCellsOff_25();
  public void RemoveGhostCellsOff()
  {
    RemoveGhostCellsOff_25();
  }

  private native void SetClipPlane_26(vtkPlane id0);
  public void SetClipPlane(vtkPlane id0)
  {
    SetClipPlane_26(id0);
  }

  private native long GetClipPlane_27();
  public vtkPlane GetClipPlane()
  {
    long temp = GetClipPlane_27();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_28();
  public long GetMTime()
  {
    return GetMTime_28();
  }

  private native void SetVolumeFractionSurfaceValue_29(double id0);
  public void SetVolumeFractionSurfaceValue(double id0)
  {
    SetVolumeFractionSurfaceValue_29(id0);
  }

  private native double GetVolumeFractionSurfaceValueMinValue_30();
  public double GetVolumeFractionSurfaceValueMinValue()
  {
    return GetVolumeFractionSurfaceValueMinValue_30();
  }

  private native double GetVolumeFractionSurfaceValueMaxValue_31();
  public double GetVolumeFractionSurfaceValueMaxValue()
  {
    return GetVolumeFractionSurfaceValueMaxValue_31();
  }

  private native double GetVolumeFractionSurfaceValue_32();
  public double GetVolumeFractionSurfaceValue()
  {
    return GetVolumeFractionSurfaceValue_32();
  }

  public vtkExtractCTHPart() { super(); }

  public vtkExtractCTHPart(long id) { super(id); }
  public native long   VTKInit();

}
