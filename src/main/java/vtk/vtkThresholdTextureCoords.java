// java wrapper for vtkThresholdTextureCoords object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkThresholdTextureCoords extends vtkDataSetAlgorithm
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

  private native void ThresholdByLower_4(double id0);
  public void ThresholdByLower(double id0)
  {
    ThresholdByLower_4(id0);
  }

  private native void ThresholdByUpper_5(double id0);
  public void ThresholdByUpper(double id0)
  {
    ThresholdByUpper_5(id0);
  }

  private native void ThresholdBetween_6(double id0,double id1);
  public void ThresholdBetween(double id0,double id1)
  {
    ThresholdBetween_6(id0,id1);
  }

  private native double GetUpperThreshold_7();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_7();
  }

  private native double GetLowerThreshold_8();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_8();
  }

  private native void SetTextureDimension_9(int id0);
  public void SetTextureDimension(int id0)
  {
    SetTextureDimension_9(id0);
  }

  private native int GetTextureDimensionMinValue_10();
  public int GetTextureDimensionMinValue()
  {
    return GetTextureDimensionMinValue_10();
  }

  private native int GetTextureDimensionMaxValue_11();
  public int GetTextureDimensionMaxValue()
  {
    return GetTextureDimensionMaxValue_11();
  }

  private native int GetTextureDimension_12();
  public int GetTextureDimension()
  {
    return GetTextureDimension_12();
  }

  private native void SetInTextureCoord_13(double id0,double id1,double id2);
  public void SetInTextureCoord(double id0,double id1,double id2)
  {
    SetInTextureCoord_13(id0,id1,id2);
  }

  private native void SetInTextureCoord_14(double id0[]);
  public void SetInTextureCoord(double id0[])
  {
    SetInTextureCoord_14(id0);
  }

  private native double[] GetInTextureCoord_15();
  public double[] GetInTextureCoord()
  {
    return GetInTextureCoord_15();
  }

  private native void SetOutTextureCoord_16(double id0,double id1,double id2);
  public void SetOutTextureCoord(double id0,double id1,double id2)
  {
    SetOutTextureCoord_16(id0,id1,id2);
  }

  private native void SetOutTextureCoord_17(double id0[]);
  public void SetOutTextureCoord(double id0[])
  {
    SetOutTextureCoord_17(id0);
  }

  private native double[] GetOutTextureCoord_18();
  public double[] GetOutTextureCoord()
  {
    return GetOutTextureCoord_18();
  }

  public vtkThresholdTextureCoords() { super(); }

  public vtkThresholdTextureCoords(long id) { super(id); }
  public native long   VTKInit();

}
