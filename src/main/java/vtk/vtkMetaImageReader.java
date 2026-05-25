// java wrapper for vtkMetaImageReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMetaImageReader extends vtkImageReader2
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

  private native byte[] GetFileExtensions_4();
  public String GetFileExtensions()
  {
    return new String(GetFileExtensions_4(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDescriptiveName_5();
  public String GetDescriptiveName()
  {
    return new String(GetDescriptiveName_5(), StandardCharsets.UTF_8);
  }

  private native int GetWidth_6();
  public int GetWidth()
  {
    return GetWidth_6();
  }

  private native int GetHeight_7();
  public int GetHeight()
  {
    return GetHeight_7();
  }

  private native int GetNumberOfComponents_8();
  public int GetNumberOfComponents()
  {
    return GetNumberOfComponents_8();
  }

  private native int GetPixelRepresentation_9();
  public int GetPixelRepresentation()
  {
    return GetPixelRepresentation_9();
  }

  private native int GetDataByteOrder_10();
  public int GetDataByteOrder()
  {
    return GetDataByteOrder_10();
  }

  private native double GetRescaleSlope_11();
  public double GetRescaleSlope()
  {
    return GetRescaleSlope_11();
  }

  private native double GetRescaleOffset_12();
  public double GetRescaleOffset()
  {
    return GetRescaleOffset_12();
  }

  private native int GetBitsAllocated_13();
  public int GetBitsAllocated()
  {
    return GetBitsAllocated_13();
  }

  private native byte[] GetDistanceUnits_14();
  public String GetDistanceUnits()
  {
    return new String(GetDistanceUnits_14(), StandardCharsets.UTF_8);
  }

  private native byte[] GetAnatomicalOrientation_15();
  public String GetAnatomicalOrientation()
  {
    return new String(GetAnatomicalOrientation_15(), StandardCharsets.UTF_8);
  }

  private native double GetGantryAngle_16();
  public double GetGantryAngle()
  {
    return GetGantryAngle_16();
  }

  private native byte[] GetPatientName_17();
  public String GetPatientName()
  {
    return new String(GetPatientName_17(), StandardCharsets.UTF_8);
  }

  private native byte[] GetPatientID_18();
  public String GetPatientID()
  {
    return new String(GetPatientID_18(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDate_19();
  public String GetDate()
  {
    return new String(GetDate_19(), StandardCharsets.UTF_8);
  }

  private native byte[] GetSeries_20();
  public String GetSeries()
  {
    return new String(GetSeries_20(), StandardCharsets.UTF_8);
  }

  private native byte[] GetImageNumber_21();
  public String GetImageNumber()
  {
    return new String(GetImageNumber_21(), StandardCharsets.UTF_8);
  }

  private native byte[] GetModality_22();
  public String GetModality()
  {
    return new String(GetModality_22(), StandardCharsets.UTF_8);
  }

  private native byte[] GetStudyID_23();
  public String GetStudyID()
  {
    return new String(GetStudyID_23(), StandardCharsets.UTF_8);
  }

  private native byte[] GetStudyUID_24();
  public String GetStudyUID()
  {
    return new String(GetStudyUID_24(), StandardCharsets.UTF_8);
  }

  private native byte[] GetTransferSyntaxUID_25();
  public String GetTransferSyntaxUID()
  {
    return new String(GetTransferSyntaxUID_25(), StandardCharsets.UTF_8);
  }

  private native int CanReadFile_26(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_26(bytes0, bytes0.length);
  }

  public vtkMetaImageReader() { super(); }

  public vtkMetaImageReader(long id) { super(id); }
  public native long   VTKInit();

}
