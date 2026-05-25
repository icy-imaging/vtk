// java wrapper for vtkNetCDFCFReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNetCDFCFReader extends vtkNetCDFReader
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

  private native int GetSphericalCoordinates_4();
  public int GetSphericalCoordinates()
  {
    return GetSphericalCoordinates_4();
  }

  private native void SetSphericalCoordinates_5(int id0);
  public void SetSphericalCoordinates(int id0)
  {
    SetSphericalCoordinates_5(id0);
  }

  private native void SphericalCoordinatesOn_6();
  public void SphericalCoordinatesOn()
  {
    SphericalCoordinatesOn_6();
  }

  private native void SphericalCoordinatesOff_7();
  public void SphericalCoordinatesOff()
  {
    SphericalCoordinatesOff_7();
  }

  private native double GetVerticalScale_8();
  public double GetVerticalScale()
  {
    return GetVerticalScale_8();
  }

  private native void SetVerticalScale_9(double id0);
  public void SetVerticalScale(double id0)
  {
    SetVerticalScale_9(id0);
  }

  private native double GetVerticalBias_10();
  public double GetVerticalBias()
  {
    return GetVerticalBias_10();
  }

  private native void SetVerticalBias_11(double id0);
  public void SetVerticalBias(double id0)
  {
    SetVerticalBias_11(id0);
  }

  private native int GetOutputType_12();
  public int GetOutputType()
  {
    return GetOutputType_12();
  }

  private native void SetOutputType_13(int id0);
  public void SetOutputType(int id0)
  {
    SetOutputType_13(id0);
  }

  private native void SetOutputTypeToAutomatic_14();
  public void SetOutputTypeToAutomatic()
  {
    SetOutputTypeToAutomatic_14();
  }

  private native void SetOutputTypeToImage_15();
  public void SetOutputTypeToImage()
  {
    SetOutputTypeToImage_15();
  }

  private native void SetOutputTypeToRectilinear_16();
  public void SetOutputTypeToRectilinear()
  {
    SetOutputTypeToRectilinear_16();
  }

  private native void SetOutputTypeToStructured_17();
  public void SetOutputTypeToStructured()
  {
    SetOutputTypeToStructured_17();
  }

  private native void SetOutputTypeToUnstructured_18();
  public void SetOutputTypeToUnstructured()
  {
    SetOutputTypeToUnstructured_18();
  }

  private native int CanReadFile_19(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_19(bytes0, bytes0.length);
  }

  public vtkNetCDFCFReader() { super(); }

  public vtkNetCDFCFReader(long id) { super(id); }
  public native long   VTKInit();

}
