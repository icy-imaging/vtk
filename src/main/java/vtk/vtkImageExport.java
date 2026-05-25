// java wrapper for vtkImageExport object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageExport extends vtkImageAlgorithm
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

  private native long GetDataMemorySize_4();
  public long GetDataMemorySize()
  {
    return GetDataMemorySize_4();
  }

  private native int[] GetDataDimensions_5();
  public int[] GetDataDimensions()
  {
    return GetDataDimensions_5();
  }

  private native int GetDataNumberOfScalarComponents_6();
  public int GetDataNumberOfScalarComponents()
  {
    return GetDataNumberOfScalarComponents_6();
  }

  private native int GetDataScalarType_7();
  public int GetDataScalarType()
  {
    return GetDataScalarType_7();
  }

  private native byte[] GetDataScalarTypeAsString_8();
  public String GetDataScalarTypeAsString()
  {
    return new String(GetDataScalarTypeAsString_8(), StandardCharsets.UTF_8);
  }

  private native int[] GetDataExtent_9();
  public int[] GetDataExtent()
  {
    return GetDataExtent_9();
  }

  private native double[] GetDataSpacing_10();
  public double[] GetDataSpacing()
  {
    return GetDataSpacing_10();
  }

  private native double[] GetDataOrigin_11();
  public double[] GetDataOrigin()
  {
    return GetDataOrigin_11();
  }

  private native double[] GetDataDirection_12();
  public double[] GetDataDirection()
  {
    return GetDataDirection_12();
  }

  private native long GetInput_13();
  public vtkImageData GetInput()
  {
    long temp = GetInput_13();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ImageLowerLeftOn_14();
  public void ImageLowerLeftOn()
  {
    ImageLowerLeftOn_14();
  }

  private native void ImageLowerLeftOff_15();
  public void ImageLowerLeftOff()
  {
    ImageLowerLeftOff_15();
  }

  private native int GetImageLowerLeft_16();
  public int GetImageLowerLeft()
  {
    return GetImageLowerLeft_16();
  }

  private native void SetImageLowerLeft_17(int id0);
  public void SetImageLowerLeft(int id0)
  {
    SetImageLowerLeft_17(id0);
  }

  private native void Export_18();
  public void Export()
  {
    Export_18();
  }

  public vtkImageExport() { super(); }

  public vtkImageExport(long id) { super(id); }
  public native long   VTKInit();

}
