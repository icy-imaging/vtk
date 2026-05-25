// java wrapper for vtkDICOMImageReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDICOMImageReader extends vtkImageReader2
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native void SetDirectoryName_5(byte[] id0, int len0);
  public void SetDirectoryName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDirectoryName_5(bytes0, bytes0.length);
  }

  private native byte[] GetDirectoryName_6();
  public String GetDirectoryName()
  {
    return new String(GetDirectoryName_6(), StandardCharsets.UTF_8);
  }

  private native double[] GetPixelSpacing_7();
  public double[] GetPixelSpacing()
  {
    return GetPixelSpacing_7();
  }

  private native int GetWidth_8();
  public int GetWidth()
  {
    return GetWidth_8();
  }

  private native int GetHeight_9();
  public int GetHeight()
  {
    return GetHeight_9();
  }

  private native float[] GetImagePositionPatient_10();
  public float[] GetImagePositionPatient()
  {
    return GetImagePositionPatient_10();
  }

  private native float[] GetImageOrientationPatient_11();
  public float[] GetImageOrientationPatient()
  {
    return GetImageOrientationPatient_11();
  }

  private native int GetBitsAllocated_12();
  public int GetBitsAllocated()
  {
    return GetBitsAllocated_12();
  }

  private native int GetPixelRepresentation_13();
  public int GetPixelRepresentation()
  {
    return GetPixelRepresentation_13();
  }

  private native int GetNumberOfComponents_14();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_14();
  }

  private native byte[] GetTransferSyntaxUID_15();
  public String GetTransferSyntaxUID()
  {
    return new String(GetTransferSyntaxUID_15(), StandardCharsets.UTF_8);
  }

  private native float GetRescaleSlope_16();
  public float GetRescaleSlope()
  {
    return GetRescaleSlope_16();
  }

  private native float GetRescaleOffset_17();
  public float GetRescaleOffset()
  {
    return GetRescaleOffset_17();
  }

  private native byte[] GetPatientName_18();
  public String GetPatientName()
  {
    return new String(GetPatientName_18(), StandardCharsets.UTF_8);
  }

  private native byte[] GetStudyUID_19();
  public String GetStudyUID()
  {
    return new String(GetStudyUID_19(), StandardCharsets.UTF_8);
  }

  private native byte[] GetStudyID_20();
  public String GetStudyID()
  {
    return new String(GetStudyID_20(), StandardCharsets.UTF_8);
  }

  private native float GetGantryAngle_21();
  public float GetGantryAngle()
  {
    return GetGantryAngle_21();
  }

  private native int CanReadFile_22(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_22(bytes0, bytes0.length);
  }

  private native byte[] GetFileExtensions_23();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_23(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_24();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_24(), StandardCharsets.UTF_8);
  }

  public vtkDICOMImageReader() { super(); }

  public vtkDICOMImageReader(long id) { super(id); }
  public native long   VTKInit();

}
