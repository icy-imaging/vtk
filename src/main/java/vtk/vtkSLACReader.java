// java wrapper for vtkSLACReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSLACReader extends vtkMultiBlockDataSetAlgorithm
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

  private native byte[] GetMeshFileName_4();
  public String GetMeshFileName()
  {
    return new String(GetMeshFileName_4(), StandardCharsets.UTF_8);
  }

  private native void SetMeshFileName_5(byte[] id0, int len0);
  public void SetMeshFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetMeshFileName_5(bytes0, bytes0.length);
  }

  private native void AddModeFileName_6(byte[] id0, int len0);
  public void AddModeFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddModeFileName_6(bytes0, bytes0.length);
  }

  private native void RemoveAllModeFileNames_7();
  public void RemoveAllModeFileNames()
  {
    RemoveAllModeFileNames_7();
  }

  private native int GetNumberOfModeFileNames_8();
  public int GetNumberOfModeFileNames()
  {
    return GetNumberOfModeFileNames_8();
  }

  private native byte[] GetModeFileName_9(int id0);
  public String GetModeFileName(int id0)
  {
    return new String(GetModeFileName_9(id0), StandardCharsets.UTF_8);
  }

  private native int GetReadInternalVolume_10();
  public int GetReadInternalVolume()
  {
    return GetReadInternalVolume_10();
  }

  private native void SetReadInternalVolume_11(int id0);
  public void SetReadInternalVolume(int id0)
  {
    SetReadInternalVolume_11(id0);
  }

  private native void ReadInternalVolumeOn_12();
  public void ReadInternalVolumeOn()
  {
    ReadInternalVolumeOn_12();
  }

  private native void ReadInternalVolumeOff_13();
  public void ReadInternalVolumeOff()
  {
    ReadInternalVolumeOff_13();
  }

  private native int GetReadExternalSurface_14();
  public int GetReadExternalSurface()
  {
    return GetReadExternalSurface_14();
  }

  private native void SetReadExternalSurface_15(int id0);
  public void SetReadExternalSurface(int id0)
  {
    SetReadExternalSurface_15(id0);
  }

  private native void ReadExternalSurfaceOn_16();
  public void ReadExternalSurfaceOn()
  {
    ReadExternalSurfaceOn_16();
  }

  private native void ReadExternalSurfaceOff_17();
  public void ReadExternalSurfaceOff()
  {
    ReadExternalSurfaceOff_17();
  }

  private native int GetReadMidpoints_18();
  public int GetReadMidpoints()
  {
    return GetReadMidpoints_18();
  }

  private native void SetReadMidpoints_19(int id0);
  public void SetReadMidpoints(int id0)
  {
    SetReadMidpoints_19(id0);
  }

  private native void ReadMidpointsOn_20();
  public void ReadMidpointsOn()
  {
    ReadMidpointsOn_20();
  }

  private native void ReadMidpointsOff_21();
  public void ReadMidpointsOff()
  {
    ReadMidpointsOff_21();
  }

  private native int GetNumberOfVariableArrays_22();
  public int GetNumberOfVariableArrays()
  {
    return GetNumberOfVariableArrays_22();
  }

  private native byte[] GetVariableArrayName_23(int id0);
  public String GetVariableArrayName(int id0)
  {
    return new String(GetVariableArrayName_23(id0), StandardCharsets.UTF_8);
  }

  private native int GetVariableArrayStatus_24(byte[] id0, int len0);
  public int GetVariableArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetVariableArrayStatus_24(bytes0, bytes0.length);
  }

  private native void SetVariableArrayStatus_25(byte[] id0, int len0,int id1);
  public void SetVariableArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVariableArrayStatus_25(bytes0, bytes0.length,id1);
  }

  private native void ResetFrequencyScales_26();
  public void ResetFrequencyScales()
  {
    ResetFrequencyScales_26();
  }

  private native void SetFrequencyScale_27(int id0,double id1);
  public void SetFrequencyScale(int id0,double id1)
  {
    SetFrequencyScale_27(id0,id1);
  }

  private native void ResetPhaseShifts_28();
  public void ResetPhaseShifts()
  {
    ResetPhaseShifts_28();
  }

  private native void SetPhaseShift_29(int id0,double id1);
  public void SetPhaseShift(int id0,double id1)
  {
    SetPhaseShift_29(id0,id1);
  }

  private native long GetFrequencyScales_30();
  public vtkDoubleArray GetFrequencyScales()
  {
    long temp = GetFrequencyScales_30();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPhaseShifts_31();
  public vtkDoubleArray GetPhaseShifts()
  {
    long temp = GetPhaseShifts_31();

    if (temp == 0) return null;
    return (vtkDoubleArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CanReadFile_32(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_32(bytes0, bytes0.length);
  }

  private native long IS_INTERNAL_VOLUME_33();
  public vtkInformationIntegerKey IS_INTERNAL_VOLUME()
  {
    long temp = IS_INTERNAL_VOLUME_33();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long IS_EXTERNAL_SURFACE_34();
  public vtkInformationIntegerKey IS_EXTERNAL_SURFACE()
  {
    long temp = IS_EXTERNAL_SURFACE_34();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long POINTS_35();
  public vtkInformationObjectBaseKey POINTS()
  {
    long temp = POINTS_35();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long POINT_DATA_36();
  public vtkInformationObjectBaseKey POINT_DATA()
  {
    long temp = POINT_DATA_36();

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkSLACReader() { super(); }

  public vtkSLACReader(long id) { super(id); }
  public native long   VTKInit();

}
