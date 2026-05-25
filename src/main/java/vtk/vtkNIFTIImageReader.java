// java wrapper for vtkNIFTIImageReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNIFTIImageReader extends vtkImageReader2
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

  private native int CanReadFile_6(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_6(bytes0, bytes0.length);
  }

  private native boolean GetTimeAsVector_7();
  public boolean GetTimeAsVector()
  {
    return GetTimeAsVector_7();
  }

  private native void SetTimeAsVector_8(boolean id0);
  public void SetTimeAsVector(boolean id0)
  {
    SetTimeAsVector_8(id0);
  }

  private native void TimeAsVectorOn_9();
  public void TimeAsVectorOn()
  {
    TimeAsVectorOn_9();
  }

  private native void TimeAsVectorOff_10();
  public void TimeAsVectorOff()
  {
    TimeAsVectorOff_10();
  }

  private native int GetTimeDimension_11();
  public int GetTimeDimension()
  {
    return GetTimeDimension_11();
  }

  private native double GetTimeSpacing_12();
  public double GetTimeSpacing()
  {
    return GetTimeSpacing_12();
  }

  private native double GetRescaleSlope_13();
  public double GetRescaleSlope()
  {
    return GetRescaleSlope_13();
  }

  private native double GetRescaleIntercept_14();
  public double GetRescaleIntercept()
  {
    return GetRescaleIntercept_14();
  }

  private native boolean GetPlanarRGB_15();
  public boolean GetPlanarRGB()
  {
    return GetPlanarRGB_15();
  }

  private native void SetPlanarRGB_16(boolean id0);
  public void SetPlanarRGB(boolean id0)
  {
    SetPlanarRGB_16(id0);
  }

  private native void PlanarRGBOn_17();
  public void PlanarRGBOn()
  {
    PlanarRGBOn_17();
  }

  private native void PlanarRGBOff_18();
  public void PlanarRGBOff()
  {
    PlanarRGBOff_18();
  }

  private native double GetQFac_19();
  public double GetQFac()
  {
    return GetQFac_19();
  }

  private native long GetQFormMatrix_20();
  public vtkMatrix4x4 GetQFormMatrix()
  {
    long temp = GetQFormMatrix_20();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSFormMatrix_21();
  public vtkMatrix4x4 GetSFormMatrix()
  {
    long temp = GetSFormMatrix_21();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNIFTIHeader_22();
  public vtkNIFTIImageHeader GetNIFTIHeader()
  {
    long temp = GetNIFTIHeader_22();

    if (temp == 0) return null;
    return (vtkNIFTIImageHeader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkNIFTIImageReader() { super(); }

  public vtkNIFTIImageReader(long id) { super(id); }
  public native long   VTKInit();

}
